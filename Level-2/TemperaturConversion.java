// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class TemperaturConversion{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int celsius = input.nextInt();

       // the Formulae Celsius to Fahrenheit
       int farenheitResult=(celsius * 9/5) + 32;

       System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
       }
}
