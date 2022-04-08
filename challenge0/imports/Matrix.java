package challenge0.imports;

import java.util.Scanner;

public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
  

    // Hack: create toString method using nested for loops to format output of a matrix

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] row : matrix) { // Enhanced for loop through matrix via rows
            for (int cell : row) { // Another enhanced for loop for the cell
                result.append((cell==-1) ? " " : String.format("%x", cell)).append(" "); // Append cell to result StringBuilder
            }
            result.append("\n"); // Create new line via %n
        }
        return result.toString(); // Return converted matrix
    }

}
