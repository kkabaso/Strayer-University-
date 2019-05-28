public class CompareLoops2
{
   public static void main(String[] args)
   {
      long startTime1, startTime2, endTime1, endTime2;
      final long REPEAT = 1000000000L;
      startTime1 = System.currentTimeMillis();
      for(int x = 0; x < REPEAT; x++);
      endTime1 = System.currentTimeMillis();
      System.out.println("Time with postfix increment: " +
         (endTime1 - startTime1)+ " milliseconds");
      startTime2 = System.currentTimeMillis();
      for(int x = 0; x < REPEAT; ++x);
      endTime2 = System.currentTimeMillis();
      System.out.println("Time with prefix increment: " +
         (endTime2 - startTime2)+ " milliseconds");
   }
}
