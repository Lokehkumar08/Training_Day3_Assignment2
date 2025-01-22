package day333;

import java.util.Scanner;

public class StrangeCalc {
    private double[] numbers;

    // Constructor to initialize with an unspecified number of arguments
    public StrangeCalc(double... numbers) {
        this.numbers = numbers;
    }

    // Method to sum the numbers
    public double sum() {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    // Method to subtract the second number from the first
    public double subtract() {
        if (numbers.length >= 2) {
            return numbers[0] - numbers[1];
        } else {
            throw new IllegalArgumentException("At least two numbers are required for subtraction.");
        }
    }

    // Method to multiply all numbers
    public double multiply() {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    // Method to divide the first number by the second
    public double divide() {
        if (numbers.length >= 2) {
            if (numbers[1] == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return numbers[0] / numbers[1];
        } else {
            throw new IllegalArgumentException("At least two numbers are required for division.");
        }
    }

    // Method to return the remainder of the division of the first number by the second
    public double remainder() {
        if (numbers.length >= 2) {
            if (numbers[1] == 0) {
                throw new ArithmeticException("Modulo by zero is not allowed.");
            }
            return numbers[0] % numbers[1];
        } else {
            throw new IllegalArgumentException("At least two numbers are required for remainder.");
        }
    }

    // Method to return the maximum number
    public double max() {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to return the minimum number
    public double min() {
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to calculate the average of the numbers
    public double average() {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to calculate the average.");
        }
        double sum = sum();
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();  // Read the number of values to input

        double[] inputNumbers = new double[count];  // Array to store the numbers

        // Read numbers from user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            inputNumbers[i] = scanner.nextDouble();  // Read each number
        }

        // Create an instance of StrangeCalc with the user-provided numbers
        StrangeCalc calc = new StrangeCalc(inputNumbers);

        // Perform calculations and display the results
        System.out.println("Sum: " + calc.sum());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
        System.out.println("Remainder: " + calc.remainder());
        System.out.println("Max: " + calc.max());
        System.out.println("Min: " + calc.min());
        System.out.println("Average: " + calc.average());

        // Close the scanner
        scanner.close();
    }
}
