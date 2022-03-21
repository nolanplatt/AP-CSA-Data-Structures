package challenge0;

/*
Creator: Nolan PlaTT
Mini Lab Name: Data Structures Challenge 0 (TT0)
*/


import java.util.ArrayList;
import java.util.Scanner;

import challenge0.imports.Swap;
import challenge0.imports.Matrix;


public class Main {   

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
            Matrix matrix = new Matrix();
        } else {
            System.exit(0);
        }
                    
             

        
    }

}