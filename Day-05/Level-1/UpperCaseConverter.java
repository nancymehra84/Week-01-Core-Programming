import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert text to uppercase using custom method
        String userDefinedUpperCase = convertToUpperCase(input);

        // Convert text to uppercase using String's built-in method
        String builtInUpperCase = input.toUpperCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedUpperCase, builtInUpperCase);

        // Display the results
        System.out.println("\nCustom Method Uppercase: " + userDefinedUpperCase);
        System.out.println("Built-in Method Uppercase: " + builtInUpperCase);
        System.out.println("Are the results identical? " + areEqual);
    }

    // Method to convert each character to uppercase
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Check if character is lowercase
                ch = (char) (ch - 32); // Convert to uppercase
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings can't be identical
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, strings are not identical
            }
        }
        return true; // Strings are identical
    }
}
