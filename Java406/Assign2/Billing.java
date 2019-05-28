public class Billing
{  
    public static void main(String args[]){
      double pricePerPhotoBook = 100.0;
      int quantity = 2;
      double coupon = 10.0;
      
      computeBill(pricePerPhotoBook);
      computeBill(pricePerPhotoBook, quantity);
      computeBill(pricePerPhotoBook, quantity, coupon);
    
      }
    //public static void computeBill(double pricePerPhotoBook)
   public static void computeBill(double pricePerPhotoBook)
       {
       double toTalDue;
       double newAmount;
       final double TAX_PAY = 0.80;

       newAmount = pricePerPhotoBook * TAX_PAY;
       toTalDue =  pricePerPhotoBook + newAmount;
       //return toTalDue;
       System.out.println("The total due of the Photo Book is $" + toTalDue);
       }
    public static void computeBill(double pricePerPhotoBook, int quantity)
       {
       double toTalDue;
       double newTotal;
       double newAmount;
       final double TAX_PAY = 0.80;
        newAmount = pricePerPhotoBook * TAX_PAY;
        newTotal = newAmount * quantity; 
        toTalDue = newTotal + (pricePerPhotoBook * quantity);
        //return toTalDue;
        System.out.println("The total due of all the order is $" + toTalDue);
    }
     public static void computeBill(double pricePerPhotoBook, int quantity, double coupon)
       {
       double toTalDue;
       double newTotal;
       double newAmount;
  
       final double TAX_PAY = 0.80;
        newAmount = pricePerPhotoBook * TAX_PAY;
        newTotal = newAmount * quantity; 
        newAmount = pricePerPhotoBook * quantity;
        toTalDue = newTotal + (pricePerPhotoBook * quantity);
        toTalDue = toTalDue - coupon;
        //return toTalDue;
        System.out.println("The total due after using a coupon of  $" + coupon + " is $" + toTalDue);
    }
    
  
}  