
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("\nGenerating IllegalArgumentException:");
        generateException(inputString);

        // Call the method that handles IllegalArgumentException
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(inputString);
    }

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        int startIndex = str.length(); // Start index set to length of the string
        int endIndex = 0; // End index less than start index
        System.out.println("Attempting to get substring from index " + startIndex + " to " + endIndex);
        // This will generate an IllegalArgumentException
        System.out.println("Substring: " + str.substring(startIndex, endIndex));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String str) {
        int startIndex = str.length(); // Start index set to length of the string
        int endIndex = 0; // End index less than start index
        try {
            // Attempt to get substring with invalid indices
            System.out.println("Attempting to get substring from index " + startIndex + " to " + endIndex);
            System.out.println("Substring: " + str.substring(startIndex, endIndex));
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("Caught IllegalArgumentException:");
            System.out.println("Start index (" + startIndex + ") cannot be greater than end index (" + endIndex + ").");
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Caught a runtime exception: " + e.getMessage());
        }
    }
}
