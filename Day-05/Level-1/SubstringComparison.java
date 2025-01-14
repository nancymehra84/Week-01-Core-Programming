import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();

        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }

        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the original string: ");
        String original = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Check if the indices are valid
        if (start < 0 || end > original.length() || start >= end) {
            System.out.println("Invalid indices. Make sure 0 <= start < end <= string length.");
            scanner.close();
            return;
        }

        // Create substring using charAt()
        String substringCharAt = createSubstring(original, start, end);

        // Create substring using built-in method
        String substringBuiltIn = original.substring(start, end);

        // Compare the two substrings
        boolean comparisonResult = compareStrings(substringCharAt, substringBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);
        System.out.println("Comparison of both substrings: " + (comparisonResult ? "Match" : "Do not match"));

        scanner.close();
    }
}
