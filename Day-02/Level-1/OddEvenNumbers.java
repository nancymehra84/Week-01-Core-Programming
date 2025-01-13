import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a positive natural number
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Loop numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
