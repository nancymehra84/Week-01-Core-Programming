// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class QuotientRemainder{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       int number2 = input.nextInt();

       //computing quotient and remainder

       int Quotient=number1/number2;
       int Reminder=number1%number2;
       
       System.out.println("The Quotient is " +Quotient+" and Reminder is "+Reminder+" of two number " + number1+" and "+number2);
       }
}
