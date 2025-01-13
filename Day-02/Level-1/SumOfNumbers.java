import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        double number;

        // While loop to keep asking for numbers until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();

            //  break out of the loop
            if (number == 0) {
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
