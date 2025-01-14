import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input to define an array of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        String[] names = new String[numberOfNames];
        System.out.println("Enter the names:");

        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateException(names);

        // Call the method to handle ArrayIndexOutOfBoundsException
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] array) {
        int invalidIndex = array.length; // Index equal to array length is invalid
        System.out.println("Attempting to access element at index " + invalidIndex);
        // This will generate ArrayIndexOutOfBoundsException
        System.out.println("Element: " + array[invalidIndex]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] array) {
        int invalidIndex = array.length; // Index equal to array length is invalid
        try {
            // Attempt to access an out-of-bounds index
            System.out.println("Attempting to access element at index " + invalidIndex);
            System.out.println("Element: " + array[invalidIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
            System.out.println("Error: Tried to access index " + invalidIndex + ", but valid range is 0 to " + (array.length - 1));
        } catch (RuntimeException e) {
            // Handle generic runtime exceptions
            System.out.println("Caught a runtime exception: " + e.getMessage());
        }
    }
}
