import java.util.Scanner;

public class LowerCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert text to lowercase using custom method
        String userDefinedLowerCase = convertToLowerCase(input);

        // Convert text to lowercase using String's built-in method
        String builtInLowerCase = input.toLowerCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedLowerCase, builtInLowerCase);

        // Display the results
        System.out.println("\nCustom Method Lowercase: " + userDefinedLowerCase);
        System.out.println("Built-in Method Lowercase: " + builtInLowerCase);
        System.out.println("Are the results identical? " + areEqual);
    }

    // Method to convert each character to lowercase
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') { // Check if character is uppercase
                ch = (char) (ch + 32); // Convert to lowercase
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
