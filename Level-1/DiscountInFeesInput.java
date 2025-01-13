// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class DiscountInFeesInput{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int Fees = input.nextInt();
       int DiscountPercent= input.nextInt();

        //Compute Discount
       int Discount=Fees * DiscountPercent/100;
       
       //Computing fees after 10% Discount
       int DiscountedFees=Fees-Discount;

       System.out.println("The discount amount is INR "+ Discount+ " and final discounted fee is INR "+ DiscountedFees);
       }
}
