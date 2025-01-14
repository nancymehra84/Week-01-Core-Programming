import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // If the lengths are not the same, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Compare strings using custom method
        boolean customComparison = compareStrings(str1, str2);

        // Compare strings using built-in equals() method
        boolean builtInComparison = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + customComparison);
        System.out.println("Comparison using built-in equals(): " + builtInComparison);

        // Check if both methods yield the same result
        if (customComparison == builtInComparison) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results do not match.");
        }

        scanner.close();
    }
}
