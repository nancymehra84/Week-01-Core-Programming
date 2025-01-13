// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class AreaOfTriangle{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       double Base = input.nextDouble();
       double Height= input.nextDouble();

        //Compute area of triangle
       double AreaInCentimeter=Base*Height/2;
       double AreaInInches=AreaInCentimeter/2.54;

       System.out.println("The Area of triangle in square inches is "+AreaInInches+" and in Square centimeter is "+AreaInCentimeter);
       }
}
