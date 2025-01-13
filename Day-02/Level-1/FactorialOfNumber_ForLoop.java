import java.util.Scanner;

public class FactorialOfNumber_ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // check weather the number is positive or negative
        if(number>=0){
           int factorial = 1;
           int i = 1;

           for(i = number; i >= 1; i--) {
             factorial *= i;     
               }
          System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
        else{
            System.out.println("Factorial does not exist for negative numbers.");
          }

        // Close the scanner
        input.close();
    }
}
