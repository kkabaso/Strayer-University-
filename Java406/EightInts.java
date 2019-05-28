public class EightInts{
	
  public static void main(String[] args)
	{
	 final int intagerNum = 8;
	 int[] intagers = {2, 6, 3, 4, 7, 8, 5, 9};
		
	   for (int i = 0 ; i < intagerNum-1; ++i)
	    for (int a=0 ; a < intagerNum-1; ++a)
	if (intagers[a] > intagers[a+1])
	  {
	   int temp = intagers[a];
	   intagers[a]= intagers[a+1];
	   intagers[a+1]=temp;
	  }
	System.out.println("Intagers in the ascending order are as follows:");
		for (int x=0; x<= intagerNum-1; x++)
        System.out.println(intagers[x]);
        System.out.println("Intagers in the descending order are as follows:");
	        for (int n=0; n<= intagerNum-1; n++)
   System.out.println(intagers[intagerNum-(1+n)]);
					
 }

}