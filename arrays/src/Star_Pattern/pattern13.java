package Star_Pattern;

//s a m p l e
//s a m p l
//s a m p
//s a m
//s a 
//s


public class pattern13 
{
	
	public static void main(String[] args) 
	{
		
		String a = "abcdefghij@1234";
		
		int length = a.length();
		
		for(int i=1; i<=a.length(); i++)
		{
			for(int j=0; j<=length-1; j++)  //we are increasing length of characters in string for every line
			{
				System.out.print(a.charAt(j));
			}
			
			System.out.println();
			
			length--;	
		}  
		
	
		
	}

}
