import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Check if positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is positive and even.");
                } else {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is negative.");
            } else {
                System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is zero.");
            }
        }

        // Compare the first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        scanner.close();
    }
}
