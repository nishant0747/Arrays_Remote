package Star_Pattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_DuplicateWordsFromStringStatement 
{
	
	public static void main(String[] args) 
	{
		String str = "My name is xyz My name is xyz is xyz I am happy person I am";
		
		String[] sa = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<=sa.length-1; i++)
		{
			set.add(sa[i]);
		}
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
