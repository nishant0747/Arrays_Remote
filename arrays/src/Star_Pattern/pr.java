package Star_Pattern;

public class pr 
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "Nishant is my name";
		String[] sa = s1.split(" ");
		String em = "";
		
		for(int i=0; i<=sa.length-1; i++)
		{
			String str = sa[i];
			String rev = "";
			
			for(int j=str.length()-1; j>=0; j--)
			{
				rev = rev+str.charAt(j);
				
			}
			
			em = em+rev+" ";
			
		}
		
		System.out.println(em);
		
		
		
	}

}
