package imports;

import java.util.Scanner;

public class Matrix {

    public Matrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------\n");
        System.out.println("Need matrix...");
        System.out.println("-------------------------\n");

        String matrix = scan.nextLine();
        System.out.println("Formatted Matrix->");
        System.out.println(matrix);
    }
   
}
