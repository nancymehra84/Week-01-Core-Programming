import java.util.Scanner;

public class StringCharacterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Call the user-defined method
        char[] userDefinedArray = getCharacters(userInput);

        // Use built-in toCharArray() method
        char[] builtInArray = userInput.toCharArray();

        // Compare the arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

        // Display the result
        System.out.println("Characters from user-defined method: " + new String(userDefinedArray));
        System.out.println("Characters from built-in toCharArray(): " + new String(builtInArray));
        System.out.println("Are the arrays equal? " + areEqual);
    }

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}