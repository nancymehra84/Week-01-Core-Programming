import java.util.Scanner;

public class HeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble(); 

        // Conversion variables
        double CM_TO_INCH_CONVERSION = 2.54; 
        int INCH_IN_FOOT = 12; 

        // Convert height in centimeters to inches
        double heightInches = heightCm; 

        // Calculate feet and remaining inches
        int feet = (int) (heightInches / INCH_IN_FOOT); 
        int inches = (int) (heightInches % INCH_IN_FOOT); 

        // Display output
        System.out.printf("Your height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+ inches);

        // Close the Scanner
        input.close();
    }
}