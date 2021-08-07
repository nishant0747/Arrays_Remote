package pkg;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class array6 
{
	
	

	public static void main(String[] args) 
	{
		int i[] = {8,5,6,9};
		
     	//Arrays.sort(i);   //sorting array
	   // System.out.println(Arrays.toString(i));
		
		int t[] = {8,5,6,9};
		
		System.out.println(t[3]);
	
		System.out.println(Arrays.equals(i, t));
		
		if(Arrays.equals(i, t)) //comparing arrays
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not");
		}
		
		String st[] = {"ganesh", "suresh", "ramesh"};
		
		ArrayList l = new ArrayList();
		
		List ab =Arrays.asList(st); //converting arrays to arraylist
		System.out.println(ab);
		
		Iterator f = ab.iterator();
		
		while(f.hasNext())
		{
			System.out.println(f.next());
		}
		
		ArrayList l1 = new ArrayList();
	    for (String aa : st )
	    {
			l1.add(aa);
		}
	    
	    for (Object ob : l1)
	    {
	    	System.out.println(ob);
			
		}
	    
	}

}
