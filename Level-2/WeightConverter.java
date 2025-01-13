import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in pound
        double weightInPounds = input.nextDouble();

        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +" and in kilograms is " + weightInKilograms + ".");

      }
}
