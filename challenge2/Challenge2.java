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
        System.out.println("Calculator: Awaiting input");
        System.out.println("Please include paranthesis () ");
        System.out.println("-------------------------\n");


        String input;
        try {
            input = scan.nextLine();  
            Calculator calculator = new Calculator(input);
            System.out.println(calculator.toString());
        } catch (Exception error) {
            System.out.println("Make sure to include paranthesis next time.");
            System.exit(0);
        }
      
    }
}
