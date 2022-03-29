package challenge2;
/**
 * Data Structure Challenge 2 | Calculator
 * Due March 29, 2022
 * @author  Nolan Platt
 */

 import java.util.Scanner;

import challenge2.imports.Calculator;

 
public class Challenge2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);  

        System.out.println("-------------------------\n");
        System.out.println("Data Structures  Challenge 2");
        System.out.println("Select an Option...");
        System.out.println("1 - No Input (Test Data)");
        System.out.println("2 - User Input (Your Data)");
        System.out.println("-------------------------\n");

        
        int option;
        option = scan.nextInt();  
        if(option == 1) {
            System.out.println("TESTING: ( 3 + SQRT 2 * 5^3 )");
            Calculator calculator = new Calculator(" ( 3 + SQRT 2 * 5^3 )");
            System.out.println(calculator.toString());
        } else {
        System.out.println("-------------------------\n");
        System.out.println("Calculator: Awaiting input");
        System.out.println("Please include parenthesis () ");
        System.out.println("-------------------------\n");

        Scanner scan2 = new Scanner(System.in);  

        String input;
        try {
            input = scan2.nextLine();  
            Calculator calculator = new Calculator(input);
            System.out.println(calculator.toString());
        } catch (Exception error) {
            System.out.println("Make sure to include parenthesis next time.");
            System.exit(0);
        }
        } 
       }
}
