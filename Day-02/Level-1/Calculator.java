import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Declare variables
        double first, second;
        String op;
        
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next();
        
        // Input second number
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        
        // Calculate and print result based on the operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
