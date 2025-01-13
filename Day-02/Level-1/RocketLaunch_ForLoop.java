import java.util.Scanner;

public class RocketLaunch_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = input.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched"); // Indicate the rocket launch
        input.close();
    }
}