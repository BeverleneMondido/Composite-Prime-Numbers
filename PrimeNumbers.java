
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("\n     MENU       \n");
        System.out.print("[1]Prime or Composite\n[2]All Prime Numbers\n[3]Exit\nChoose an option -->");
        int option = scan.nextInt();
        
            if (option == 1) {
                // I only put a range of 1-30 numbers in order to showcase the program with smaller range of numbers //
                System.out.print("Enter any number from 0 to 30 (negative numbers are also allowed): ");   
                Scanner number = new Scanner(System.in);              
                int check = number.nextInt();
                if (check >= 31){                   // the program will not be able to identify number beyond 30//
                    System.out.println("Number out of range. Please choose from  1 to 30 only.");
                    continue;
                }
                if (check == 0 || check == 1) {
                    System.out.println(check + " is Neither Prime nor Composite");
                    continue;
                }
                if (check == -1 || check == 2 || check == 3 || check == 5 || check == 7 || check == 11 || check == 13 || check == 17 || check == 19 || check == 23 || check == 29){
                    System.out.println(check + " is a Prime Number");             //-1, 2 and all other numbers that has only one factor are  Prime Numbers//
                    continue;
                }
                if (check >= -2 || check == 4 || check == 6 || check == 8 | check == 9 || check == 10 || check == 12 || check <=  14 || check >= 16 || check == 18 || check <=  20 || check >= 22 || check <=24  || check == 28 || check == 30 ) {
                    System.out.println(check + " is Composite Number");           //all negative numbers except -1 are composite //
                    //For this one, I put an infinite range of negative number and up to range 30 of positive numbers
                    continue;
                }                                                                          
            }            
            if (option == 2) {

                Scanner sc = new Scanner(System.in);

                int num1, num2, x, y, flag;                                             //declare the variables//

                System.out.printf("Enter first integer: ");
                num1 = sc.nextInt();                                                     //scan the first input//

                System.out.printf("Enter second integer:");
                num2 = sc.nextInt();                                                     // Scan second input//

                System.out.println("\nPrime numbers between " + num1 + " and " + num2 + " are:");

                for (x = num1; x <= num2; x++) {

                    if (x == 1 || x == 0) //This is to not include 1 and 0 because they are neither prime nor composite
                    {
                        continue;
                    }

                    flag = 1;                                                   //flag is used to identify if a number is prime or not//

                    for (y = 2; y <= x / 2; ++x) {                             //to identify input if composite and skips it.//
                        if (x % y == 0) {
                            flag = 0;
                            break;
                        }
                    }

                    if (flag == 1) {                                           //flag = 1 is prime, flag = 0 is not prime//
                        System.out.println(x);

                    }
                }              
            }        
            if (option >= 4 || option <=0 ) {          //This is incase the user accidentally inputs: a nagtive number; number lower than 1 or above 3
                System.out.printf("Option Error. Please choose between 1 to 3 only!");
                continue;
            }            
            if (option  == 3) {
                System.out.println("Exit!");
                break;
            }
        }     
   }
}

