import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sides of the triangular park
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert the target distance (5 km) into meters
        double totalDistance = 5000;

        // Calculate the number of rounds
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

      }
}
