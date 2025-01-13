import java.util.Scanner;

public class VoteEligiblityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the age
        System.out.print("Enter a age: ");
        int age = input.nextInt();

        // Check if the number is a natural number
        if (age >= 18) {
            System.out.println(" The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        }
}
