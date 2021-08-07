package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class repeating_wordCount_fromStringPara
{
	
	public static void main(String[] args)
	{
		
		String str = "abc abcd abc ab abcd abc xyz abc abc xyz xyz ab";
		
		String ar[] = str.split(" ");
		
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			
			String s1 = ar[i];
			
			if(mp.containsKey(s1))
			{
				
				mp.put(s1, mp.get(s1)+1);
				
			}
			
			else
			{
				
				mp.put(s1, 1);
			}
			
		}
		
		Set<String> str2 = mp.keySet();
		
		for(String st : str2)
		{
			
			System.out.println(st+":"+mp.get(st));
			
		}
		
		
	}

}
