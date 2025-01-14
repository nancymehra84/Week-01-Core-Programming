import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        generateException(inputString);

        // Call the method that handles NumberFormatException
        System.out.println("\nHandling NumberFormatException:");
        handleException(inputString);
    }

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Attempting to convert text to number: " + text);
        // This will generate a NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempt to parse the string to an integer
            System.out.println("Attempting to convert text to number: " + text);
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("Caught NumberFormatException:");
            System.out.println("Error: '" + text + "' is not a valid integer.");
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Caught a runtime exception: " + e.getMessage());
        }
    }
}
