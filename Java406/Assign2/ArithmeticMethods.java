public class ArithmeticMethods
{  
    public static void main(String args[]){
      int num1 = 2, num2 = 5;
      displayNumberPlus10(num1, num2);
      displayNumberPlus100(num1, num2);
      displayNumberPlus1000(num1, num2);
       }
    public static void displayNumberPlus10(int num1, int num2)
       {
        int newNum1 = num1 + 10;
        int newNum2 = num2 + 10;
        System.out.println(num1 + " + 10 = " + newNum1 + " and " + num2 + " + 10 = " + newNum2);
       }
    public static void displayNumberPlus100(int num1, int num2){
        int newNum1 = num1 + 100;
        int newNum2 = num2 + 100;
        System.out.println(num1 + " + 100 = " + newNum1 + " and " + num2 + " + 100 = " + newNum2);
       
       }
    public static void displayNumberPlus1000(int num1, int num2){
        int newNum1 = num1 + 1000;
        int newNum2 = num2 + 1000;
        
       
        System.out.println(num1 + " + 1000 = " + newNum1 + " and " + num2 + " + 1000 = " + newNum2);  
       }  
}  