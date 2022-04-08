package challenge0;

/**
 * Data Structure Challenge 0 
 * @author  Nolan Platt
 */

import java.util.ArrayList;
import java.util.Scanner;

import challenge0.imports.Swap;
import challenge0.imports.Matrix;


public class Challenge0 {   

     static public void main(String[] args)  { 
        ArrayList<String> submenus;
        submenus = new ArrayList<String>();
        submenus.add("Swap");
        submenus.add("Matrix");
        menu(submenus); 
    } 

    public static void menu(ArrayList<String> submenus) {
        Scanner scan = new Scanner(System.in);  


        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Swap");
        System.out.println("2 - Matrix");
        System.out.println("3 - Exit");


        int option;
        option = scan.nextInt();  
        if(option == 1) {
            Swap swap = new Swap();
        } else if (option == 2){
            Matrix m0 = new Matrix(keypad());
            System.out.println("Keypad:");
            System.out.println(m0);
    
            Matrix m1 = new Matrix(numbers());
            System.out.println("Numbers Systems:");
            System.out.println(m1);
        } else {
            System.exit(0);
        }
                    
             

        
    }

    
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

}