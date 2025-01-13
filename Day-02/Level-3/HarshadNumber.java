import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;
        int temp = number; // Temporary variable to process the digits

        // Use a while loop to get the sum of the digits
        while (temp != 0) {
            sum += temp % 10; // Add last digit to sum
            temp /= 10; // Remove last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
