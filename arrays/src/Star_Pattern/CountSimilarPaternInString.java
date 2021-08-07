package Star_Pattern;

public class CountSimilarPaternInString 
{
	public static void main(String[] args) 
	{
		
		String str = "iso/para/sumito/para/para";
		
		String[] tv = str.split("/");
		
		int a =0;
		
		
		for(int i=0; i<=tv.length-1; i++)
		{
			String s = tv[i];
			
			if(s.equals("para"))
			{
				a++;
			}
			
		}
		
		System.out.println(a);
		System.out.println("abcd");
	}

}
