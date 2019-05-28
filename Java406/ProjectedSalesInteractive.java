import java.util.Scanner;
class ProjectedSalesInteractive{  
    public static void main(String args[]){
      final Double INCREASE = 0.10;
      int northSale; 
      int southSale; 
      Double northProjection; 
      Double southProjection;
Scanner input = new Scanner(System.in);
      System.out.println("Enter the current year Sales for the north division >>");
       northSales = input.nextint();
      System.out.println("Enter the current year Sales for the south division >>");
       southSales = input.nextint();
      northProjection = northSales + northSales * INCREASE;
      southProjection = southSales + southSales * INCREASE;
     System.out.println("The projected Sales figure for the North Division is " +  northProjection);
     System.out.println("The projected Sales figure for the south Division is " +  southProjection);  
    }  
}  