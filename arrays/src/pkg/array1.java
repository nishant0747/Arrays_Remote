package pkg;

import java.util.Arrays;

public class array1 
{
	public static void main(String[] args) 
	{

		String ar[] = new String[5];
		ar[0] = "ganesh";
		ar[1] = "ramesh";
		ar[2] = "suresh";
		ar[3] = "mahesh";
		ar[4] = "rahul";
		// ar[5]="aaaaa";
		
	
	
		System.out.println(ar.length);

		System.out.println(ar[3]); // mahesh
		
		System.out.println("------print all info in array-----");

		for (int i = 0; i <=4; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("-------Reverse arrary-----");
		
		for (int i = 4; i >=0; i--) {
			System.out.println(ar[i]);
		}
		
		System.out.println("----foreachloop----");
		for (String ab: ar) 
		{
			System.out.println(ab);
			
		}
		
		System.out.println("----sorting of array----");
		 Arrays.sort(ar);
		 
		 for (String str : ar)
		 {
			System.out.println(str);
		}
		
		float []f = new float[8]; //syntax 1
		int a[];                  //syntax 2
		double []x,y;             //syntax 3
		String []ar1,ar2[];       // syntax 4 ar1 is 1D array and ar2 is 2D array
		int [][]c, d[];		// c is 2D and d is 3D array
		
		int t[],h[][];

		

	}
}


