// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class UserSalary{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int Salary = input.nextInt();
       int Bonus = input.nextInt();

       //Compute income by adding salary and bonus
       int TotalIncome=Salary+Bonus;

       System.out.println("The salary is INR "+ Salary +" and bonus is INR "+ Bonus + ". Hence Total Income is INR " + TotalIncome);
       }
}
