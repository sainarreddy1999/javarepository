public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



import java.util.Scanner;

public class EnumExample {
    public enum Operation {
        ADD,
        SUB,
        DIV,
        MUL,
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the operation (ADD, SUB, DIV, MUL):");
        String operationInput = scanner.nextLine().toUpperCase();
        
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        Operation operator;
        try {
            operator = Operation.valueOf(operationInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please enter one of the following: ADD, SUB, DIV, MUL.");
            scanner.close();
            return;
        }

        switch (operator) {
            case ADD:
                System.out.println("Result: " + (a + b));
                break;
            case SUB:
                System.out.println("Result: " + (a - b));
                break;
            case DIV:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case MUL:
                System.out.println("Result: " + (a * b));
                break;
            default:
                System.out.println("Wrong input");
        }
        
        scanner.close();
    }
}
