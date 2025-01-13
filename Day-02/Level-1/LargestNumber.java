import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter the numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        // Check if the  first is the smallest of the 3 numbers.
       boolean isSmallest = (number1 > number2 && number1 > number3);

       // Output the result
        System.out.println("Is the first number the largest? " + isSmallest);
    }
}
