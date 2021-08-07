package Star_Pattern;

public class pattern14 
{
	
	public static void main(String[] args) 
	{
		
		String s = "NishantMane@123";
		
		int l = s.length();
		
		for(int i =0; i<=s.length()-1; i++) // for rows only
		{
			
			for(int j=0; j<=l-s.length(); j++) // decreasing the char size for each row
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
			l++;
			
		}

}
	
}
