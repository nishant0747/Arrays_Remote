package Star_Pattern;

public class reverse_steps 
{
	
	public static void main(String[] args) 
	{
		
		
		String s1 = "sqrqzq";
		int a =s1.length();
		
		for(int i =0; i<=s1.length()-1; i++)
		{
			for(int j=0; j<=a-1; j++)
			{
				
				System.out.print(s1.charAt(j));
			}
			
			System.out.println();
			a--;
			
		}
		
		for(int i =0; i<=s1.length()-1; i++)
		{
			for(int j=0; j<=a-s1.length(); j++)
			{
				
				System.out.print(s1.charAt(j));
			}
			
			System.out.println();
			a++;
			
		}
		
		
	}

}
