import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the countdown starting value
        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Perform the countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Print the rocket launch message
        System.out.println("Rocket Launched");

        // Close the scanner
        input.close();
    }
}
