package Star_Pattern;

public class duplicatestringcharacterscount 
{
	
	public static void main(String[] args)
	{
		
		String str = "missisipim";
		
		int a=0;
		int b=0;
		int d=0;
		int e =0;
		
		char[] cr = str.toCharArray();
		
		for(int i=0; i<=cr.length-1; i++)
		{
			char c = cr[i];
			
			if(c=='m')
			{
				a++;
			}
			
			else if(c=='i')
			{
				b++;
			}
			
			else if(c=='s')
			{
				d++;
			}
			
			else if(c=='p')
			{
				e++;
			}
			
		}
		
		System.out.println("count of i : "+b);
		
		System.out.println("count of m : "+a);
		
		System.out.println("count of s : "+d);
		
		System.out.println("count of p : "+e);
		
		
		
	}

}
