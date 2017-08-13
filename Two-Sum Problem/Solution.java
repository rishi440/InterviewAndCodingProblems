import java.util.*;

public class Solution 
{
    public int[] twoSum(int[] a, int target)
    {
        int[] indices = new int[2]; 
        indices[0] = -1;
        indices[1] = -1;
        
        if(a.length<1)
            return indices;
        
        int otherNumber = 0;
        
        HashMap<Integer, Integer> arrayMap = new HashMap();
        
        for(int i=0; i<a.length; i++)
        arrayMap.put(a[i],i);
        
        for(int j=0; j<a.length; j++)
        {
            int required = 0;
            required = target - a[j];
            
            if( arrayMap.containsKey(required) && arrayMap.get(required)!=j)
            {
                indices[0] = j;
                indices[1] = arrayMap.get(target-a[j]);
                break;
            }
        }
        
        return indices;
    }
        
}
