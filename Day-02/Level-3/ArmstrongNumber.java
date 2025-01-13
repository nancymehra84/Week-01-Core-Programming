import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Get the input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        int number = input.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to process each digit of the number
        while (number != 0) {
            // Find the remainder of the number (last digit)
            int digit = number % 10;

            // Cube the digit and add it to the sum
            sum += Math.pow(digit, 3);

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}
