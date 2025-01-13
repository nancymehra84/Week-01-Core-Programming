import java.util.Scanner;

public class KilometerToMile {
       public static void main(String[]args){
       //Create a variable km and assign type as double
       double km;

       //Creating Scanner Object to take user input from Standard Input
       Scanner input = new Scanner(System.in);
        
       //Use Scanner Object to take user input for km
       km = input.nextInt();

       //Converting KM to Miles
       double Miles = km* 1.6;

       //output
       System.out.println("The total miles is "+Miles+" mile for the given "+km+" km");
       }
}
