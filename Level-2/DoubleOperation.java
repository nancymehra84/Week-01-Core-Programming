// Writing Java Code to take user contact details as input and display it
import java.util.Scanner;

public class DoubleOperation{
       public static void main(String[]args){
       
       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double num3 = input.nextDouble();

       //computing integer operation

       double OperationOne=num1 + num2 *num3;
       double OperationTwo= num1 * num2 + num3;
       double OperationThree= num1 + num2 / num3;
       double OperationFour=num1 % num2 + num3;
       
       
       System.out.println("The results of Double Operations are "+OperationOne+","+OperationTwo+","+OperationThree+" and "+OperationFour);
       }
}