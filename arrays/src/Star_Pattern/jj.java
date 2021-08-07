package Star_Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class jj 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("m");
		al.add("v");
		al.add("233");
		al.add("344.7");
		al.add("m");
		al.add("v");
		al.add("233");
		al.add("v");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0; i<=al.size()-1; i++)
		{
			String s = al.get(i);
			
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}

			else
			{
				hm.put(s, 1);
			}
					
					
		}
		
		Set<String> f = hm.keySet();

		for (String str : f) 
		{
			
			System.out.println(str+":"+hm.get(str));
			
		}
		
		
	}

}
