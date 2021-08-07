package pkg;

import java.util.Arrays;

public class array2 
{
	public static void main(String[] args) 
	{

		String ar[] = new String[5];
		ar[0] = "ganesh";
		ar[1] = "ramesh";
		ar[2] = "suresh";
		//ar[3] = "mahesh";	
		ar[4] = "rahul";
		
		
		System.out.println(ar[2]);
		
		System.out.println(ar.length);
	
		System.out.println("------print array in reverse order-----");

		for (int i = ar.length-1; i >= 0; i--) 
		{
			System.out.println(ar[i]);
		}
		
		String as[] = Arrays.copyOf(ar, 10); //Only way to incease size of array
		as[0] = "A";
		as[1] = "B";
		as[2] = "C";
		as[3] = "D";
		as[9] = "j";
		as[4] = "E";
		as[5] = "F";
		as[6] = "G";
		
		System.out.println(as.length);
	
		System.out.println(as[9]);
		
		for (String str : as)
		{
			System.out.println(str);
		}
		
//		String []aa = Arrays.copyOf(as, 4);
//		aa[0] = "aa";
//		aa[1] = "bb";
//		aa[2] = "cc";
//		aa[3] = "dd";
//		aa[4] = "ty";
//		aa[5] = "hb";
//		aa[6] = "tt";
//		aa[9] = ",sd";
		
	//	System.out.println(aa[9]);
		
		
	
		String h[] = new String[4];
		h[0] = "n";
		h[1] = "g";
		//h[2] = "a";
		h[3] = "w";
		
		for (String c : h) 
		{
			System.out.println(c);
			
		}
		
				

		
				
		
		
	
		

	}
	
	
}


