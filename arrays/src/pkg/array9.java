package pkg;

import java.util.Arrays;

public class array9 
{
	
	public static void main(String[] args) 
	{
		
		int a[] = {3,5,6,4,2,1,7,8,9,10};
		
		
		for (int i : a) 
		{
			System.out.println(i);
		}
		
		System.out.println("-------");
		
		System.out.println(a[2]);
		
		System.out.println("-------");
		
		Arrays.sort(a);
		
		System.out.println(a[2]);
		
		System.out.println("-------");
		
		for(int i=0; i<=a.length-1; i=i+2)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
