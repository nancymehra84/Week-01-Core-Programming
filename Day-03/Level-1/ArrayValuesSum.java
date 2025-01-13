import java.util.Scanner;

public class ArrayValuesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to get user input
        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop:");
        while (true) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            // Check for termination conditions
            if (input <= 0 || index == 10) {
                break;
            }

            // Store the value in the array
            numbers[index] = input;
            index++;
        }

        // Calculate the total and display all numbers
        System.out.println("You entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total
        System.out.println("The total is: " + total);

        sc.close();
    }
}
