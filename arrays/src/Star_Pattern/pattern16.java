package Star_Pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// To remove duplicates from a String we need to convert 
//String to <Character>LinkedHashset
public class pattern16 
{
	
	public static void main(String[] args) 
	{
		
		String s = "Nishant123Nishant@@tarzan@tarzan";
		System.out.println(s);
		
		
		
	//	TreeSet<Character> ts = new<Character> TreeSet();
		
		Set<Character> st = new<Character>LinkedHashSet();
		
		for(int i =0; i<=s.length()-1; i++)
		{
			st.add(s.charAt(i));
		}
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for (Character cr : st) 
		{
		   sb.append(cr);
		}
		System.out.println(sb);
		
//		Iterator<Character> it = ts.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		System.out.println("----OR-----");
		
		Iterator<Character> itr = st.iterator();

	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next());
	    }
	    

	    
	    
		

		
	}

}
