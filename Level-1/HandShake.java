// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class HandShake{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int numberOfStudents = input.nextInt();

       //Code to find maximum number of handshake
       int MaximumHandshake=(numberOfStudents * (numberOfStudents - 1)) / 2;

       System.out.println("Maximum Handshake:"+ MaximumHandshake);
       }
}
