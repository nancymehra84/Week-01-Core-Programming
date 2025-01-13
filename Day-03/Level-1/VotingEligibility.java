import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] studentAges = new int[10];

        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input for age of 10 student using loop 
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = sc.nextInt();
        }
        
        // Display the output
        System.out.println("Voting eligibility results:");

        for (int age : studentAges) {
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        // Close the scanner
        sc.close();
    }
}