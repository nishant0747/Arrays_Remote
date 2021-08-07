package Star_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class pattern15 
{
	public static void main(String[] args) 
	{
		
		int a[] = {234, 678, 2, 3423, 100, 34, 480, 78, 507, 34, 510};
		
		
		TreeSet<Integer> tr = new <Integer>TreeSet();
		
		for (Integer it : a) 
		{
			
			tr.add(it);	
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.addAll(tr);
		
		System.out.println("---third highest number-------");

		System.out.println(al.get(al.size()-3));
		
		
		

		
		
		
		
		
		
	}
	

}
