import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Print the multiplication table for numbers 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner object
        input.close();
    }
}
