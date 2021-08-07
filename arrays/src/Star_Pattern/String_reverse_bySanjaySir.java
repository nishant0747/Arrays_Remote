package Star_Pattern;

public class String_reverse_bySanjaySir
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "pqrs";
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println("original String : "+s1);
		System.out.println("Reverse String : "+s2);
		
		String s3 = "Nilesh";
		
		char[] s4 = s3.toCharArray();//{'a','b','c','d'}
		
		for(int i=s4.length-1; i>=0; i--)
		{
			System.out.print(s4[i]);
		}
		
		
		
		
	}

}
