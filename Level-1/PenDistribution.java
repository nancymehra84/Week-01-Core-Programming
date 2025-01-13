public class PenDistribution{
       public static void main(String[]args){
       //Creating variables to store Values
       int Pen=14;
       int Student= 3;

       //Use Division Operator to find the Quantity of pens
       int PenPerStudent=Pen/Student;
       
       //Use Modulus Operator (%) to find the reminder.
       int RemainingPen=Pen%Student;

       // Displaying 
       System.out.println("The Pen Per Student is " + PenPerStudent + " and the remaining pen not distributed is "+RemainingPen);
       }
}
