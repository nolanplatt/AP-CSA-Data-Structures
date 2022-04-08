package challenge0.imports;

import java.util.Scanner;

public class Swap {

    public Swap() {
        
         //print a ver of swap that display without using input/output
        System.out.println("Orginial Set: 16, 5");
       int option3 = 5;  
        int option4 = 16;  

        if(option3 > option4) {
            int swap = option3;
            option3 = option4;
            option4 = swap;
        }
        System.out.println("Swapped Set: " + option3 + ", " + option4);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------\n");
        System.out.println("Need 2 numbers...");
        System.out.println("-------------------------\n");
        int option1, option2;
        option1 = scan.nextInt();  
        option2 = scan.nextInt();  

        if(option1 > option2) {
            int swap = option1;
            option1 = option2;
            option2 = swap;
        }
        System.out.println("Result-> " + option1 + ", " + option2);
    }
    
}
