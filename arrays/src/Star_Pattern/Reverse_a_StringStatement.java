package Star_Pattern;

public class Reverse_a_StringStatement 
{
	
	public static void main(String[] args) 
	{
		
		String str= "My Name is Nishant Shivaji Mane";
		
		String[] f = str.split(" ");
		
		String[] rev = str.split(" ");
		
		for(int i=rev.length-1; i>=0; i--)
		{
			
			System.out.print(rev[i]+ " ");
		}
	}

}
