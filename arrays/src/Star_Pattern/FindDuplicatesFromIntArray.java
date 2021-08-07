package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicatesFromIntArray 
{
	
	public static void main(String[] args) 
	{
		
		int a[]= {1,4,3,23,34,23,4};
		
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =0; i<=a.length-1; i++)
		{
			int b = a[i];
			
			if(hm.containsKey(b))
			{
				hm.put(b, hm.get(b)+1);
			}
			
			else
			{
				hm.put(b, 1);
			}
		}
		
		Set<Integer> g = hm.keySet();
		
		for (Integer in : g)
		{
			
			System.out.println(in+":"+hm.get(in));
			
		}
		
		
		
		
	}

}
