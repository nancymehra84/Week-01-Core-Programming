// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class IntOperation{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       int num2 = input.nextInt();
       int num3 = input.nextInt();

       //computing integer operation

       int OperationOne=num1 + num2 *num3;
       int OperationTwo= num1 * num2 + num3;
       int OperationThree= num1 + num2 / num3;
       int OperationFour=num1 % num2 + num3;
       
       
       System.out.println("The results of Int Operations are "+OperationOne+","+OperationTwo+","+OperationThree+" and "+OperationFour);
       }
}