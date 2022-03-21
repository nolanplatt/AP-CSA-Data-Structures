import java.util.Scanner;

import challenge0.Challenge0;
import challenge1.Challenge1;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  


        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Challenge 0");
        System.out.println("2 - Challenge 1");
        System.out.println("3 - Exit");


        int option;
        option = scan.nextInt();  
        if(option == 1) {
            Challenge0 challenge0 = new Challenge0();
            challenge0.main(args);
        } else if (option == 2) {
            Challenge1 challenge1 = new Challenge1();
            challenge1.main(args);
        }  else {
            System.exit(0);
        }

}
}