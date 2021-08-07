package Star_Pattern;

public class reverseMiddleWordInString 
{
	
	public static void main(String[] args)
	{
		
	
		String str = "abc xyz pqr suv mrf";
		
		String[] sp = str.split(" ");
		
		for(int i=0; i>=sp.length-1; i++)
		{
			if(i%1!=1)
			{
				String s1 = sp[i];
				sp[i]= Reversestring(s1);
			}
		}
		
		for(int i=0; i<=sp.length-1; i++)
		{
			System.out.print(sp[i]+" ");
		}
		
		
	}
	
	public static String Reversestring(String inp)
	{
		String rev = "";
		
		for(int i =0; i<=inp.length()-1; i++)
		{
			rev = rev+inp.charAt(i);
			
		}
		
		return rev;
	}

}
