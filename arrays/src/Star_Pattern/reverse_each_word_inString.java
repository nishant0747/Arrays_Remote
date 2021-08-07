package Star_Pattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class reverse_each_word_inString 
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "My Name is Nishant Shivaji Mane";
		
		String rev = "";
		
		String[] s3 = s1.split(" ");
		
		for(int i=0; i<=s3.length-1; i++)
		{
			String eachword = s3[i]; // My Name 
			String revWord = "";
			
			
			for(int j=eachword.length()-1; j>=0; j--)
			{
				
				revWord = revWord+eachword.charAt(j);
			}
			
			rev = rev +revWord+" ";
			
		}
		
		System.out.println(rev);
		
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			
//			s2=s2+s1.charAt(i);
//		}
//		
//		System.out.println(s2);
		
		

		
		
	
		
	}

}
