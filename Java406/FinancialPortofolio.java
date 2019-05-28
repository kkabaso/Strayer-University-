import java.util.Scanner;
public class FinancialPortofolio
{  
    public static void main(String args[]){
      double  totalValue = 0.0;
      int  portfolioNumber;
      
     double newTotalValue;
      String  firstName;
      String  lastName;
      double accountBalance;
      String accountNumber;
      //int accountNumber;
      
      String  bondName;
      double  faceValue;
      int  numberOfBonds;
      
      String  stockName;
      double  stockValue ;
      int  numberOfShares;
      
      double totalBondsValue = 0.0;
      
Scanner input = new Scanner(System.in); 
  //System.out.print("Enter total value of the portfolio >>$");
      // totalValue = input.nextDouble();
           
    System.out.println("Enter the portfolio number >>");
           portfolioNumber = input.nextInt();
           
    System.out.println("Enter the number of bonds  >>");
           numberOfBonds = input.nextInt();
           
    System.out.println("Enter number of Shares >>");
           numberOfShares = input.nextInt();
          
    System.out.println("Enter account Balance >>");
           accountBalance = input.nextDouble();
           
    System.out.println("Enter stock value >>");
           stockValue = input.nextDouble();
           
    System.out.println("Enter face value >>");
          faceValue = input.nextDouble();
    
    System.out.println( "Enter client’s Last Name" ); 
          lastName = input.nextLine();
          
    System.out.println( "Enter client’s Last Name" ); 
          lastName = input.nextLine(); 
          
    System.out.println( "Enter client’s First Name" ); 
          firstName = input.nextLine();
          
    System.out.println("Enter account Number >>");
           accountNumber = input.nextLine();
           
    System.out.println( "Enter Stock Name" ); 
           stockName = input.nextLine(); 
 
    System.out.println( "Enter bond Name" ); 
           bondName = input.nextLine(); 
           input.close();
 
       computeSavingsAccount(totalValue, accountBalance, accountNumber, firstName);
       computeBonds(totalValue, faceValue, numberOfBonds, bondName);
       computeStocks(totalBondsValue, totalValue, stockName, numberOfShares, stockValue);
       
       //newTotalValue = totalStockValue + totalValue + totalBondsValue;
       //System.out.println("Portfolio value:  $" +  newTotalValue  );
    }
    public static void computeSavingsAccount(double totalValue, double accountBalance, String accountNumber, String firstName)
        {
        totalValue = totalValue + accountBalance; 
      
       System.out.println("The Portfolio Name: " + firstName + " ’s Portfolio");
       System.out.println("Savings account: Blue Bank  ($" +  totalValue + ")");
       }
    public static void computeBonds(double totalValue, double faceValue, int numberOfBonds, String bondName)
       {
        double totalBondsValue;
//add the total bonds value (bond value multiplied by the number of bonds) to the portfolio total value
        totalBondsValue = (faceValue * numberOfBonds);
         totalBondsValue = totalBondsValue + totalValue;
     
       System.out.println("Bonds:  " + bondName + " ($" + totalBondsValue  + ")");
    }
    public static void computeStocks(double totalBondsValue, double totalValue, String stockName, int numberOfShares, double stockValue)
       {
        double totalStockValue;
        double newTotalValue;
//The stocks object must add the total stocks value (stock value multiplied by the number of shares)to the total portfolio value
        totalStockValue = (stockValue * numberOfShares);
        totalStockValue = totalStockValue + totalValue;
        
        newTotalValue = totalStockValue + totalBondsValue;
        //totalStockValue = totalStockValue + totalBondsValue;
        System.out.println("Stock  " + stockName + "($" + totalStockValue + ")");
       
//Portfolio Name:      Jane’s Portfolio
//Savings account:   Blue Bank ($2000.00)
//Bonds:                   Derby ($3000.00)
//Stocks:                  IBM ($10000.00)totalBondsValue
//Portfolio value:      $15000.00
     
       System.out.println("Portfolio value:  $" +  newTotalValue);
       }
 }

