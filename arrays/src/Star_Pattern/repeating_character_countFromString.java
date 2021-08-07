package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class repeating_character_countFromString 
{
	
	public static void main(String[] args) 
	{
		String s1 = "abcdefgabcdefgaaa";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			
			char c = s1.charAt(i);
			
			if(hm.containsKey(c))
			{
				
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
				
		}
		
		Set<Character> g = hm.keySet();
		
		for (Character cr : g) 
		{
			System.out.println(cr+":"+ hm.get(cr));
			
		}
		
		
		
	}

}
