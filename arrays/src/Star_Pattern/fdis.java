package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class fdis 
{
	
	public static void main(String[] args) 
	{
		
		String str = "Nishant@Nishantt";
		
		HashMap<Character, Integer> hm = new <Character, Integer>HashMap();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char c = str.charAt(i);
			
		
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			
			else
			{
				
				hm.put(c, 1);
			}
			
		}
		
		Set<Character> s = hm.keySet();
		
		for (Character cr : s) 
		{
			
			System.out.println(cr+":"+hm.get(cr));
			
		}
		
	}

}
