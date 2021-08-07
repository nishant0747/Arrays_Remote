package Star_Pattern;

import java.util.Collection;
import java.util.HashMap;

public class Hashmap
{
	
	public static void main(String[] args) 
	{
		
		HashMap <String, Integer>hm = new <String, Integer>HashMap();
		hm.put("Nishant", 1200000);
		hm.put("Nishant", 2000000);
		hm.put("Ravan", 2000000);
		hm.put("Surya", 800000);
		hm.put("Ram", 300000);
		
		//HashMap don't allow duplicate Key's 
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.get("Nishant"));
		
		System.out.println(hm.values()); //Used to get all values from RHS
		
		System.out.println(hm.keySet()); //used to get all Key's from LHS
		
		System.out.println(hm.containsKey("Surya"));
		
		System.out.println(hm.containsValue(2000000));
		
	//	hm.remove("Nishant");
		
		System.out.println(hm);
		
		Collection<Integer> g = hm.values();
		
		for (Integer in : g) 
		{
			System.out.println(in);
			
		}
		
		
		
		
	}

}
