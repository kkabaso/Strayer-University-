import java.util.Scanner;
class MilesToFeetInteractive{  
    public static void main(String args[]){
      
      
 final float FEET_PER_MILE = 5280;
               
              double distanceInFeet;
              double distanceInMile = 8.5;
Scanner input = new Scanner(System.in);
      System.out.println("Enter the distance in Miles >>");
       distanceInMile = input.nextint();
      System.out.println("Enter the distance in Feets >>");
       distanceInFeet = input.nextint();
      
      
      distanceInFeet = distanceInMile * FEET_PER_MILE;
     System.out.println("The distance to my uncle's house is" + distanceInMile + "miles or " + distanceInFeet + " feet."); 
      }  
}

