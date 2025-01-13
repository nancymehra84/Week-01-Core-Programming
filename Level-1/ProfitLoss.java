public class ProfitLoss{
       public static void main(String[]args){
         
       //Assigning variable
       int CostPrice= 129;
       int SellingPrice=191;

       //Computing Profit
       int Profit=SellingPrice- CostPrice;

       //Calculating profit percentage
       double ProfitPercentage=(double)Profit/CostPrice*100;

       //Displaying the output
       System.out.println("The Cost Price is INR "+ CostPrice+" and Selling Price is INR "+SellingPrice+"\n"+"The Profit is INR "+Profit+" and the Profit Percentage is "+ProfitPercentage);
       }
}
