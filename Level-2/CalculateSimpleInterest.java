import java.util.Scanner;

public class CalculateSimpleInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input principal amount
        double principal = input.nextDouble();

        // Input rate of interest
        double rate = input.nextDouble();

        double time = input.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +" for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + " years.");

    }
}
