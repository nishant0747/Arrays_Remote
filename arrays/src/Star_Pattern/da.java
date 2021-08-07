package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class da
{
	
	public static void main(String[] args) 
	{
		
		String s = "abc ef abc ef mn abc jo jo mn fvg fv fvg fv go go go go";
		
		String[] sr = s.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0; i<=sr.length-1; i++)
		{
			String duplicate = sr[i];
			
			if(hm.containsKey(duplicate))
			{
				hm.put(duplicate, hm.get(duplicate)+1);
			}
			
			else
			{
				
				hm.put(duplicate, 1);
			}
			
		}
		
		Set<String> g = hm.keySet();
		
		for (String st : g) 
		{
			
			System.out.println(st+":"+hm.get(st));
			
		}
		
	}

}
