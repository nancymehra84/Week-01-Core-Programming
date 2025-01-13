import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of chocolates
        
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesChildGets = numberOfChocolates / numberOfChildren;
        int ChocolatesRemaining = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " +chocolatesChildGets +" and the number of remaining chocolates are "+ChocolatesRemaining );
    }
}
