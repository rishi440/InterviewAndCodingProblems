import java.util.*;

public class LongestCommonSubsequence
{
   public static void main(String args[])
   {
      String s1 = new String();
      String s2 = new String(); 
      int lcsLength = 0;
      
      System.out.println("\n *** Longest Common Subsequence Finder *** \t");
      System.out.println();
      System.out.println();
      System.out.println("\n Enter first string \t");
      Scanner scan = new Scanner(System.in); 
      s1 = scan.nextLine(); 
      System.out.println("\n Enter second string \t");
      s2 = scan.nextLine();
      
      System.out.println("\n String 1 ====> \t" + s1 );
      System.out.println("\n String 2 ====> \t" + s2 );   
      
      lcsLength = findLCS(s1.toCharArray(),s2.toCharArray()); 
      
      System.out.println("\n The longest common subsequence is of length \t" + lcsLength); 
      
      
   }
   
   public static int findLCS(char s1[], char[] s2)
   {
      int len1 = 0, len2 = 0;
      int result = 0;
            
      len1 = s1.length;
      len2 = s2.length; 
      int lcsFinder[][] = new int[len1+1][len2+1];
      
      int colPos = lcsFinder.length;
       
      
      for(int i=1; i<colPos; i++)
      {
         int rowPos = lcsFinder[i].length;
         
         for(int j=1; j<rowPos; j++)
         {
            if(s1[i-1] == s2[j-1])
            lcsFinder[i][j] = lcsFinder[i-1][j-1] + 1;
            
            else
            lcsFinder[i][j] = Math.max(lcsFinder[i][j-1], lcsFinder[i-1][j]);
            
            if(lcsFinder[i][j] > result)
            result = lcsFinder[i][j];
            
         }
         
      }
              
               
     
      return result; 
   }
   
}