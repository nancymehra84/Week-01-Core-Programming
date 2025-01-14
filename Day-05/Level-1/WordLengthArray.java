import java.util.Scanner;

public class WordLengthArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Split text into words using custom method
        String[] words = splitTextIntoWords(input);

        // Create a 2D array with words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display the results in a tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");
        for (String[] entry : wordLengthArray) {
            System.out.printf("%-10s\t%d\n", entry[0], Integer.parseInt(entry[1]));
        }
    }

    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100]; // Temporary array to hold words
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ' || ch == '\t') {
                // If space or tab is encountered, add the word to the array
                if (currentWord.length() > 0) {
                    words[wordCount++] = currentWord.toString();
                    currentWord.setLength(0); // Reset current word
                }
            } else {
                currentWord.append(ch);
            }
        }

        // Add the last word if any
        if (currentWord.length() > 0) {
            words[wordCount++] = currentWord.toString();
        }

        // Trim the array to actual word count
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);

        return result;
    }

    // Method to calculate the length of a string without using length()
    public static int calculateLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length); // Accessing characters until exception
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(calculateLength(words[i])); // Length as String
        }

        return result;
    }
}