// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class SideOfSquare{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int Perimeter = input.nextInt();

        //Code to find side of the square
       int Side=Perimeter/4;

       System.out.println(" The length of the side is "+Side+" whose perimeter is "+ Perimeter);
       }
}
