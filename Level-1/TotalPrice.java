// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class TotalPrice{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int UnitPrice = input.nextInt();
       int Quantity = input.nextInt();

       //Code to find Price
       int TotalPurchase=UnitPrice*Quantity;

       System.out.println("The total purchase price is INR "+TotalPurchase+" if the quantity "+Quantity+" if the quantity " +UnitPrice);
       }
}
