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

        // prompt user
        System.out.println("-------------------------\n");
        System.out.println("Data Structures  Challenge 3");
        System.out.println("Select an Option...");
        System.out.println("1 - Start Analysis of AdvancedArrayList using Bubble Sort, Selection Sort, and Insertion Sort. Uses 5000 elements each and runs 12 times.");
        System.out.println("-------------------------\n");
        int option;
        option = scan.nextInt(); 

        if(option == 1) { // no other option - simply a prompt
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
      System.out.println("Average speed (s):" + bubbleSortSpeedTotal / 1000000000.0);
      

      System.out.println("-------------------------\n");
      System.out.println("Selection Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + selectionSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + selectionSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + selectionSortSpeedTotal / 10);
      System.out.println("Average speed (s):" + selectionSortSpeedTotal / 1000000000.0);


      System.out.println("-------------------------\n");
      System.out.println("Insertion Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + insertionSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + insertionSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + insertionSortSpeedTotal / 10);
      System.out.println("Average speed (s):" + insertionSortSpeedTotal / 1000000000.0);

      System.out.println("-------------------------\n");
      System.out.println("Merge Sort");
      System.out.println("-------------------------\n");
      System.out.println("Average numSwaps: " + mergeSortSwapTotal / 10);
      System.out.println("Average numComparisons: " + mergeSortComparisonTotal / 10);
      System.out.println("Average speed (ns): " + mergeSortSpeedTotal / 10);
      System.out.println("Average speed (s):" + mergeSortSpeedTotal / 1000000000.0);

        }
        
    }

}

class BubbleSort {
    // member variables
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    
    BubbleSort() { // constructor
         size = 0;
         numComparisons = 0;
         numSwaps = 0;
        AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

        while(size < 5001) { // initialize AAL
        int num = 60 + (int) (Math.random() * 400000);
            // random number 60 to 400000 to avoid repeats / mixed data
         aal.add(num);
         size++;
    }

    boolean sorted = false;
    Instant start = Instant.now();
    while(!sorted) {
    for (int i = 0; i < aal.size() - 1; i++) { // original loop
        for (int j = 0; j < aal.size() - 1 - i; j++) { // nested (secondary) loop
            numComparisons++; // add to comparison counter
            if (aal.get(j) > aal.get(j + 1)) { // check if original > nested + 1
                int temp = aal.get(j); // initialize temp (to avoid setting equal twice)
                aal.set(j, aal.get(j + 1)); // swap
                aal.set(j + 1, temp); // swap back
                numSwaps++; // add to swaps counter
                sorted = true;
            }
        }
    }
    }

    // Start Bubble Sort
    Instant done = Instant.now(); // end timer
    timeElapsed = Duration.between(start, done); // find difference in nanoseconds
    
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
    // member variables
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    SelectionSort() {
        size = 0;
        numComparisons = 0;
        numSwaps = 0;
       AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

       while(size < 5001) { // initialize AAL
       int num = 60 + (int) (Math.random() * 400000); // random num 60 to 40000 ( avoids mixed/repeated data)

        aal.add(num);
        size++;
    }
    // Start Selection Sort
    Instant start = Instant.now(); // starts timer
    for (int j = 0; j < aal.size() - 1; j++) { // original loop
        int smaller = j;
        for (int k = j + 1; k < aal.size(); k++) { // nested (secondary) loop
            if (aal.get(k) < aal.get(smaller)) {
                numComparisons++; // add to comparisons counter
                smaller = k;
            }
        }
        int temp = aal.get(smaller); // initialize temp
        aal.set(smaller, aal.get(j)); // swap
        aal.set(j, temp); // swap back
        numSwaps++;
    }
    Instant done = Instant.now(); // end timer
    timeElapsed = Duration.between(start, done); // find difference in nanoseconds
   

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
    // member variables
    int size;
    int numComparisons;
    int numSwaps;
    Duration timeElapsed;
    InsertionSort() {
        size = 0;
        numComparisons = 0;
        numSwaps = 0;
       AdvancedArrayList<Integer> aal = new AdvancedArrayList<>(10, 0);

       while(size < 5001) { // initialize AAL
       int num = 60 + (int) (Math.random() * 400000); // random num 60 to 40000 ( avoids mixed/repeated data)

        aal.add(num);
        size++;
    }
    
    // Start Insertion Sort
    Instant start = Instant.now(); // starts timer

    for(int i = 1; i < aal.size(); i++){ // original loop
        int check = aal.get(i);
        for(int j = i - 1 ; j >= 0; j--){ // nested (secondary) loop
            if(check < aal.get(j)){ // comparison
                numComparisons++;  // adds to comparison counter
                aal.set(j + 1, aal.get(j)); // swap
                numSwaps++; // add to swap counter
                if(j == 0){ // comparison
                    numComparisons++; // adds to comparison counter
                    aal.set(0, check); // swap again
                    numSwaps++; // add to swap counter
                }
            } 
            else{ // comparison
                numComparisons++;
                aal.set(j + 1, check); // secondary swap if needbe 
                break;
            }
        }
    }
    Instant done = Instant.now(); // end timer
    timeElapsed = Duration.between(start, done); // find different in nanoseconds
   
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
    // member variables
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

       while(size < 5001) { // initialize AAL
       int num = 60 + (int) (Math.random() * 400000); // random num 60 to 400000 ( avoids mixed / repeated data)

        aal.add(num);
        size++;
    }
    
    // Start Insertion Sort
    Instant start = Instant.now(); // starts timer


    // divides into elements recursively and then starts merge sort in its primary method
    divideIntoElements(0, aal.size() - 1); // divides
   
   
    
    Instant done = Instant.now(); // ends timer
    timeElapsed = Duration.between(start, done); // finds difference in nanoseconds

   
}

public void mergeIntoElements(int indS, int indM, int indE) {

    ArrayList<Integer> temp = new ArrayList<>(); // creates temporary arraylist

    int leftPeek = indS; // finds left merge
    int rightPeek = indE + 1; // finds right merge

    while (leftPeek <= indM && rightPeek <= indE) { // while left merge <= starting middle and right merge < end
        numComparisons++;
        if (aal.get(leftPeek) <= aal.get(rightPeek)) {
            numComparisons++; // add to comparisons
            temp.add(aal.get(leftPeek)); // add left peek to temporary arraylist
            leftPeek++;

        } else {
            numComparisons++; // add to comparisons
            temp.add(aal.get(rightPeek)); // add to temporary arraylist ( right peek )
            rightPeek++;

        }
    }

    while (leftPeek <= indM) {
        numComparisons++; // add to comparisons
        temp.add(aal.get(leftPeek)); // add to temporary arraylist (leftPek)
        leftPeek++;
    }

    while (rightPeek <= indE) {
        numComparisons++; // add to comparisons
        temp.add(aal.get(rightPeek)); // add to temporary arraylist ( right peek )
        rightPeek++;
    }


    for (int i = 0; i < temp.size(); indS++) {
        numSwaps++; // add to swap counter
        aal.set(indS, temp.get(i++)); // swap

    }

}


    void divideIntoElements(int indS, int indE) { // recursively divides

    if (indS < indE && (indE - indS) >= 1) {
        numComparisons++; // adds to comparisons
        int mElement = (indE + indS) / 2; // finds element integer
        divideIntoElements(indS, mElement); // divides starting and middle
        divideIntoElements(mElement + 1, indE); // divides middle + 1 and ending
        mergeIntoElements(indS, mElement, indE); // merges starting, middle & end ( after all 3 finished )
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
