import java.util.Scanner;
public class SimpleCalculator {
       public static void main(String[]args){

       //Creating Scanner object to take input from user
       Scanner input = new Scanner(System.in);
       int number1=input.nextInt();
       int number2=input.nextInt();
       
       //code to perform Arithmatic Operation
       int Addition=number1+number2;
       int Substraction=number1-number2;
       int Multiplication=number1*number2;
       double Division=number1/number2;
       
       //Display Output
       System.out.println("The addition, subtraction, multiplication and division value of two numbers "+number1+ " and "+number2+" is "+ Addition+","+Substraction+","+Multiplication+" and "+ Division);
       }
}
