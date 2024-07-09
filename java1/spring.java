// ArithmeticOperations.java
public class ArithmeticOperations {
    
    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Create an instance of ArithmeticOperations
        ArithmeticOperations operations = new ArithmeticOperations();
        Scanner scanner = new Scanner(System.in);
        
        // Read values from user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Perform arithmetic operations
        int additionResult = operations.add(num1, num2);
        int subtractionResult = operations.subtract(num1, num2);
        int multiplicationResult = operations.multiply(num1, num2);
        int divisionResult = 0;
        try {
            divisionResult = operations.divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Print results
        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);
        
        // Close the scanner
        scanner.close();
    }
}
