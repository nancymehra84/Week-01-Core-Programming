import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Initialize count variable
        int count = 0;

        // Handle the case where the number is 0
        if (number == 0) {
            count = 1;  // 0 has one digit
        } else {
            // Use a loop to count the number of digits
            while (number != 0) {
                // Remove the last digit from the number
                number /= 10;

                // Increase the count by 1 in each iteration
                count++;
            }
        }

        // Display the count of digits
        System.out.println("The number of digits is: " + count);
        
        input.close();
    }
}
