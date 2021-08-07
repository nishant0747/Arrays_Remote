package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class array8 
{
	
	public static void main(String[] args) 
	{
	     //converting int array to List
		
		String[]f = {"rf","dcw","wefe"};
		
		List <String>gh = new LinkedList<String>();
		
		for (String in : f)
		{
			gh.add(in);
		}
		
		System.out.println(gh);
		
		gh.add("92.1f");
		gh.add("89.3f");
		gh.add(0, "9f");

		Iterator<String> it = gh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(f[0]);
		

		
		
		
	}

}
