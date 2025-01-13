public class VolumeOfEarth{
       public static void main(String[]args){
       
       //Assigning value
       int RadiusOfEarth=6378;
       double ConversionToMile=0.621;
       //Computing Volume of sphere in Cubic Kilometer
       double VolumeEarth=(4/3)* Math.PI * Math.pow(RadiusOfEarth,3);
       
       //Computing Volume of sphere in Cubic Miles
       double VolumeInMile=VolumeEarth*Math.pow(ConversionToMile,3);

       //Output 
       System.out.println(" The volume of earth in cubic kilometers is "+ VolumeEarth+" and cubic miles is "+VolumeInMile);
       }
}
