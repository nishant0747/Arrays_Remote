package Star_Pattern;

public class stpes 
{
	
	public static void main(String[] args) 
	{
		
		
		String s1 = "Vijaykulkarniyeda";
		
		int b = s1.length();
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			for(int j=0; j<=b-s1.length(); j++)
			{
				
				System.out.print(s1.charAt(j));
				
			}
			System.out.println();
			b++;
			
		}
		
	}

}
