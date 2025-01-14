public class NullPointerExceptionCase {
    public static void main(String[] args) {
        // Call the method to generate the exception
        System.out.println("Generating NullPointerException:");
        generateException();

        // Call the method that handles NullPointerException
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Variable initialized to null
        try {
            
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught while generating NullPointerException: " + e.getMessage());
        }
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Variable initialized to null
        try {
            // Attempt to use a String method
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught a NullPointerException.");
            System.out.println("The variable is null. Please initialize it before accessing methods.");
        }
    }
}
