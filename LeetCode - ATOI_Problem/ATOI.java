import java.util.*;

public class ATOI 
{
    public int myAtoi(String str) 
    {
        str = str.trim();
        char[] number = new char[str.length()];
        number = str.toCharArray();
        double result = 0;
        int countOperator = 0;
        boolean hasMinus = false;

        
        if(number.length == 1 && number[0]== '-')
            return 0;
        else if(number.length == 1 && number[0]== '+')
            return 0;
        
        for(int j=0; j<number.length; j++)
        {
              if(number[j] == '-' || number[j] == '+')
              {    
                  countOperator++;
                  
                  if(number[j] == '-')
                      hasMinus = true;
              }
             
        }
        
        if(countOperator>1)
            return 0;
        
        
        for(int i= 0 ; i<number.length; i++)
        {    
           
             
                if(number[i] == '-' || number[i] == '+')
                {    
                    i = i+1;
                    
                }
            
                if(Character.isLetter(number[i]) == true )
                break;
                else if(number[i]== ' ')
                break;
            

            
                if(Character.isDigit(number[i]) == true )
                {
                    result *=10;
                    result += (number[i] - '0') ;
                }
            
                
          
            
        }

        if(hasMinus == true)
            result = (-1) * (result);
        
        
        
        if (result > Integer.MAX_VALUE)
		return Integer.MAX_VALUE;
 
	    else if (result < Integer.MIN_VALUE)
		return Integer.MIN_VALUE;
        
        return  (int) result;
    }
}