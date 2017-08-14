import java.util.*;

public class Fibonacci
{
   public static long memo[] = new long[200];
   
   public static long findFib(int n)
   {
      long current = 0;
      
      if(n==0)
      return 0;
      
      else if(n==1)
      return 1;
      
      else if(memo[n]!= 0)
      return memo[n];
      
      else
      {
         
         current = findFib(n-1) + findFib(n-2);
         memo[n] = current;
      }
      
      
      return current;
      
   }
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n = 0;
            
      System.out.println("Enter the number of fibonacci elements");
      n = scan.nextInt();
      
      long preTime=System.currentTimeMillis();

      for(int i=0;i<=n;i++)
      System.out.print(Long.toString(findFib(i))+ "   ");
      
      long postTime=System.currentTimeMillis();
      System.out.println("\n Time taken to compute in milliseconds->"+(postTime-preTime));
   }
}
      