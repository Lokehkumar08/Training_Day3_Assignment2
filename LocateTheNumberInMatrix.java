//import java.util.Scanner;
//
//public class Exercise4R {
//    private static int matrix[][] = {
//        {1, 7, 3, 9, 5, 3},
//        {6, 2, 3},
//        {7, 5, 1, 4, 0},
//        {1, 0, 2, 9, 6, 3, 7, 8, 4}
//    };
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between 0 and 9:");
//
//        int target = -1;
//        try {
//            target = sc.nextInt();
//
//            // Check if the number is between 0 and 9
//            if (target < 0 || target > 9) {
//                System.out.println("Please provide a number between 0 and 9.");
//                return; // Exit if the number is outside the valid range
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please provide a valid integer.");
//            return; // Exit if the input is not a valid integer
//        }
//
//        // Search for the target number in the matrix
//        boolean found = false;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == target) {
//                    System.out.println("Number " + target + " found at position (" + i + ", " + j + ")");
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break; // Exit outer loop as well
//        }
//
//        if (!found) {
//            System.out.println("Number " + target + " not found in the matrix.");
//        }
//
//        sc.close(); // Close the scanner to avoid resource leak
//    }
//}
package day333;

import java.util.Scanner;

public class LocateTheNumberInMatrix {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of rows for the matrix
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        
        // Declare the matrix with user-defined rows
        int[][] matrix = new int[rows][];
        
        // Get the number of columns and values for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            matrix[i] = new int[cols];
            
            System.out.println("Enter " + cols + " values for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); // Display with a tab for spacing
            }
            System.out.println(); // Newline after each row
        }
        
        // Ask for the target number
        System.out.print("\nEnter a number between 0 and 9 to search for: ");
        int target = sc.nextInt();

        // Validate the target number
        if (target < 0 || target > 9) {
            System.out.println("Please provide a number between 0 and 9.");
            sc.close();
            return;
        }

        // Search for the target number in the matrix
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Number " + target + " found at position (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break; // Exit outer loop if found
        }

        if (!found) {
            System.out.println("Number " + target + " not found in the matrix.");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}

