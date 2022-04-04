/**
 * Data Structure Challenge 3 | Sorts
 * Due April 4th, 2022
 * @author  Nolan Platt
 */

package challenge3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import challenge3.imports.AdvancedArrayList;


public class Challenge3 {
    public static void main (String[] args) {
        
        
     
        
        Scanner scan = new Scanner(System.in);  

        System.out.println("-------------------------\n");
        System.out.println("Data Structures  Challenge 3");
        System.out.println("Select an Option...");
        System.out.println("1 - Start Analysis of AdvancedArrayList using Bubble Sort, Selection Sort, and Insertion Sort. Uses 5000 elements each and runs 12 times.");
        System.out.println("-------------------------\n");
        int option;
        option = scan.nextInt(); 

        if(option == 1) {
            int bubbleSortSwapTotal = 0;
            int bubbleSortComparisonTotal = 0;
            int bubbleSortSpeedTotal = 0;
          for(int i = 0; i < 12; i++) { // Bubble Sort
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSortSwapTotal += bubbleSort.getNumSwaps();
                bubbleSortComparisonTotal += bubbleSort.getNumComparisons();
                bubbleSortSpeedTotal += bubbleSort.getTimeElapsed();
          }

          int selectionSortSwapTotal = 0;
          int selectionSortComparisonTotal = 0;
          int selectionSortSpeedTotal = 0;

          for(int i = 0; i < 12; i++) { // Selection Sort
            SelectionSort selectionSort = new SelectionSort();
            selectionSortSwapTotal += selectionSort.getNumSwaps();
            selectionSortComparisonTotal += selectionSort.getNumComparisons();
            selectionSortSpeedTotal += selectionSort.getTimeElapsed();
      }

        int insertionSortSwapTotal = 0;
        int insertionSortComparisonTotal = 0;
        int insertionSortSpeedTotal = 0;
          for(int i = 0; i < 12; i++) { // Insertion Sort
            InsertionSort insertionSort = new InsertionSort();
            insertionSortSwapTotal += insertionSort.getNumSwaps();
            insertionSortComparisonTotal += insertionSort.getNumComparisons();
            insertionSortSpeedTotal += insertionSort.getTimeElapsed();

      }


      int mergeSortSwapTotal = 0;
      int mergeSortComparisonTotal = 0;
      int mergeSortSpeedTotal = 0;
      for(int i = 0; i < 12; i++) { // Merge Sort
            MergeSort mergeSort = new MergeSort();
            mergeSortSwapTotal += mergeSort.getNumSwaps();
            mergeSortComparisonTotal += mergeSort.getNumComparisons();
            mergeSortSpeedTotal += mergeSort.getTimeElapsed();
      }

      // Print Out

      System.out.println("-------------------------\n");
      System.out.println("Bubble Sort");
      System.out.println("-------------------------\n");

      System.out.println("Average numSwaps: " + bubbleSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + bubbleSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + bubbleSortSpeedTotal / 10);
      

      System.out.println("-------------------------\n");
      System.out.println("Selection Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + selectionSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + selectionSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + selectionSortSpeedTotal / 10);


      System.out.println("-------------------------\n");
      System.out.println("Insertion Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + insertionSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + insertionSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + insertionSortSpeedTotal / 10);

      System.out.println("-------------------------\n");
      System.out.println("Merge Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + mergeSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + mergeSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + mergeSortSpeedTotal / 10);

        }
        
    }

}

class BubbleSort {
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    
    BubbleSort() {
         size = 0;
         numComparisons = 0;
         numSwaps = 0;
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        while(size < 5001) {
        int num = 60 + (int) (Math.random() * 400000);

         aal.add(num);
         size++;
    }

    boolean sorted = false;
    Instant start = Instant.now();
    while(!sorted) {
    for (int i = 0; i < aal.size() - 1; i++) {
        for (int j = 0; j < aal.size() - 1 - i; j++) {
            numComparisons++;
            if (aal.get(j) > aal.get(j + 1)) {
                int temp = aal.get(j);
                aal.set(j, aal.get(j + 1));
                aal.set(j + 1, temp);
                numSwaps++;
                sorted = true;
            }
        }
    }
    }

    // Start Bubble Sort
    Instant done = Instant.now();
    timeElapsed = Duration.between(start, done);
    
}

int getNumComparisons() {
    return numComparisons;
}
int getNumSwaps() {
    return numSwaps;
}
int getTimeElapsed() {
    return timeElapsed.getNano();
}


}

class SelectionSort{
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    SelectionSort() {
        size = 0;
        numComparisons = 0;
        numSwaps = 0;
       AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

       while(size < 5001) {
       int num = 60 + (int) (Math.random() * 400000);

        aal.add(num);
        size++;
    }
    // Start Selection Sort
    Instant start = Instant.now();
    for (int j = 0; j < aal.size() - 1; j++) {
        int smaller = j;
        for (int k = j + 1; k < aal.size(); k++) {
            if (aal.get(k) < aal.get(smaller)) {
                numComparisons++;
                smaller = k;
            }
        }
        int temp = aal.get(smaller);
        aal.set(smaller, aal.get(j));
        aal.set(j, temp);
        numSwaps++;
    }
    Instant done = Instant.now();
    timeElapsed = Duration.between(start, done);
   

    }

    int getNumComparisons() {
        return numComparisons;
    }
    int getNumSwaps() {
        return numSwaps;
    }
    int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}

class InsertionSort {
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    InsertionSort() {
        size = 0;
        numComparisons = 0;
        numSwaps = 0;
       AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

       while(size < 5001) {
       int num = 60 + (int) (Math.random() * 400000);

        aal.add(num);
        size++;
    }
    
    // Start Insertion Sort
    Instant start = Instant.now();

    for(int i = 1; i < aal.size(); i++){
        int check = aal.get(i);
        for(int j = i - 1 ; j >= 0; j--){
            if(check < aal.get(j)){
                numComparisons++;
                aal.set(j + 1, aal.get(j));
                numSwaps++;
                if(j == 0){
                    numComparisons++;
                    aal.set(0, check);
                    numSwaps++;
                }
            } 
            else{
                numComparisons++;
                aal.set(j + 1, check);
                break;
            }
        }
    }
    Instant done = Instant.now();
    timeElapsed = Duration.between(start, done);
   
}

int getNumComparisons() {
    return numComparisons;
}
int getNumSwaps() {
    return numSwaps;
}
int getTimeElapsed() {
    return timeElapsed.getNano();
}

}

class MergeSort {
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    AdvancedArrayList<Integer> aal;
    MergeSort() {
        size = 0;
        numComparisons = 0;
        numSwaps = 0;
       aal = new AdvancedArrayList<>(10, 0);

       while(size < 5001) {
       int num = 60 + (int) (Math.random() * 400000);

        aal.add(num);
        size++;
    }
    
    // Start Insertion Sort
    Instant start = Instant.now();


    // divides into elements recursively and then starts merge sort in its primary method
    divideIntoElements(0, aal.size() - 1);
   
   
    
    Instant done = Instant.now();
    timeElapsed = Duration.between(start, done);

   
}

public void mergeIntoElements(int indS, int indM, int indE) {

    ArrayList<Integer> temp = new ArrayList<>();

    int leftPeek = indS;
    int rightPeek = indE + 1;

    while (leftPeek <= indM && rightPeek <= indE) {
        numComparisons++;
        if (aal.get(leftPeek) <= aal.get(rightPeek)) {
            numComparisons++;
            temp.add(aal.get(leftPeek));
            leftPeek++;

        } else {
            numComparisons++;
            temp.add(aal.get(rightPeek));
            rightPeek++;

        }
    }

    while (leftPeek <= indM) {
        numComparisons++;
        temp.add(aal.get(leftPeek));
        leftPeek++;
    }

    while (rightPeek <= indE) {
        numComparisons++;
        temp.add(aal.get(rightPeek));
        rightPeek++;
    }


    for (int i = 0; i < temp.size(); indS++) {
        numSwaps++;
        aal.set(indS, temp.get(i++));

    }

}


    void divideIntoElements(int indS, int indE) {

    if (indS < indE && (indE - indS) >= 1) {
        numComparisons++;
        int mElement = (indE + indS) / 2;
        divideIntoElements(indS, mElement);
        divideIntoElements(mElement + 1, indE);
        mergeIntoElements(indS, mElement, indE);
    }
}

int getNumComparisons() {
    return numComparisons;
}
int getNumSwaps() {
    return numSwaps;
}
int getTimeElapsed() {
    return timeElapsed.getNano();
}

}