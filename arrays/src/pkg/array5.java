package pkg;

import java.util.Arrays;

public class array5
{
	
	public static void main(String[] args)
	{
		
		float t[]= new float[6];
		t[0] = 66.987788f;
		t[5] = 99.99f;
		t[5] = 99.99f;  
		t[5] = 99.99f;  //In array indexwise sequential printing is happens even if we exchange their position
		t[5] = 99.99f;  // If we take one index multiple times then it will not repeat the value
		t[5] = 99.99f;
		t[5] = 99.99f;
		t[1] = 5956.89f;
		t[2] = 880.23f;
		t[3] = 100.833f;
		t[4] = 99.99f;
		
	
		for(int i=0; i<=5; i++)
		{
			System.out.println(t[i]);
		}
		
		System.out.println("------------");
		
		Arrays.sort(t);
		for(int i=0; i<t.length; i++)
		{
			System.out.println(t[i]);
			
		}
		System.out.println("------------");
		for (float f : t) 
		{
			System.out.println(f);
			
		}
		
		System.out.println("------array to arrayList-------");
		
		Arrays.asList(t);
		for (float r : t) 
		{
			System.out.println(r);
		}
		
		
		
	}

}
