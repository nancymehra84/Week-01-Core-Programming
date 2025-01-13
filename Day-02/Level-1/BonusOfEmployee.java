import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the Salary and year of service
        System.out.print("Enter the Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter the year of service: ");
        int Year= input.nextInt();
        double Bonus=0;
        // check weather the year is less or more then 5
        if (Year >= 5) {
            Bonus=salary*0.05;
            System.out.println("The bonus is : " + Bonus);
        } else {
            System.out.println("You are not eligible for bonus.");
        }
        // close the scanner
        input.close();
        }
}
