import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        double number;

        // Infinite while loop, continues until break
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            number = input.nextDouble();

            // If the user enters 0 or a negative number, break the loop
            if (number <= 0) {
                break;
            }

            // Add the number to the total sum
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}
