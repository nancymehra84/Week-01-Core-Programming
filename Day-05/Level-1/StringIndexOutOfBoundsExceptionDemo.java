import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        generateException(inputString);

        // Call the method that handles StringIndexOutOfBoundsException
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(inputString);
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Intentionally accessing an out-of-bound index
        int invalidIndex = str.length() + 1; // Index beyond the string length
        System.out.println("Attempting to access character at index " + invalidIndex);
        System.out.println("Character: " + str.charAt(invalidIndex)); // This generates the exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        int invalidIndex = str.length() + 1; // Index beyond the string length
        try {
            // Attempt to access the invalid index
            System.out.println("Attempting to access character at index " + invalidIndex);
            System.out.println("Character: " + str.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception gracefully
            System.out.println("Caught StringIndexOutOfBoundsException:");
            System.out.println("Error: Tried to access index " + invalidIndex + ", but the valid range is 0 to " + (str.length() - 1));
        }
    }
}
