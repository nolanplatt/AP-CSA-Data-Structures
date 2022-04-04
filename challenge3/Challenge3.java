package challenge3;

import java.util.Random;
import java.util.Scanner;
import challenge3.imports.AdvancedArrayList;

/**
 * Data Structure Challenge 3 | Sorts
 * Due April 4th, 2022
 * @author  Nolan Platt
 */



public class Challenge3 {
    public static void main (String[] args) {
        
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        aal.add(0);
        aal.add(5);
        aal.add(20);

     
        
        Scanner scan = new Scanner(System.in);  

        System.out.println("-------------------------\n");
        System.out.println("Data Structures  Challenge 3");
        System.out.println("Select an Option...");
        System.out.println("1 - Start Analysis of AdvancedArrayList using Bubble Sort, Selection Sort, and Insertion Sort. Uses 5000 elements each and runs 12 times.");
        System.out.println("-------------------------\n");
        int option;
        option = scan.nextInt(); 

        if(option == 1) {
            BubbleSort bsort = new BubbleSort();
        }
        
    }

}

class BubbleSort {
    BubbleSort() {
        int size = 0;
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        Random random = new Random();
        while(size < 5001) {
         aal.add(random.nextInt(1000));
         size++;
    }
    }
}

class SelectionSort{
    SelectionSort() {
        int size = 0;
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        Random random = new Random();
        while(size < 5001) {
         aal.add(random.nextInt(1000));
         size++;
    }
    }
}

class InsertionSort {
    InsertionSort() {
        int size = 0;
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        Random random = new Random();
        while(size < 5001) {
         aal.add(random.nextInt(1000));
         size++;
    }
    }

}