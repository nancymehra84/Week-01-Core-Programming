// Writing Java Code to take user contact details as input and display it
public class DiscountInFees{
       public static void main(String[]args){
       //Assigning value
       int Fees=125000;
       int DiscountPercentage=10;
       
       //Compute Discount
       int Discount=Fees * DiscountPercentage/100;
       
       //Computing fees after 10% Discount
       int DiscountedFees=Fees-Discount;

       //Print
       System.out.println("The discount amount is INR "+ Discount+ " and final discounted fee is INR "+ DiscountedFees);
       }
}
