package imports;

import java.util.Scanner;

public class Swap {

    public Swap() {
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
