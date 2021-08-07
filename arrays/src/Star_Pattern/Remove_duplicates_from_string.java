package Star_Pattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_from_string 
{
	
	public static void main(String[] args) 
	{
		
		String s6 = "abcdabcdNishantNishant";
		
		Set<Character> c = new LinkedHashSet<Character>();
		
		for(int i=0; i<=s6.length()-1; i++)
		{
			c.add(s6.charAt(i));
			
		}
		
		Iterator<Character> d = c.iterator();   //Approach 1
		
	    while(d.hasNext())
	    {
	    	System.out.print(d.next());
	    	
	    }
	    System.out.println();
		
		StringBuilder sb = new StringBuilder(); //Approach 2
		
		for (Character ch : c)
		{
			 sb.append(ch);
			
		}
		
		System.out.println(sb);
		
	}

}
