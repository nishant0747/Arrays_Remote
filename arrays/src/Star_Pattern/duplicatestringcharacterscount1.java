package Star_Pattern;

public class duplicatestringcharacterscount1 
{
	public static void main(String[] args) 
	{
		
		String str = "gggffftttvvvvg";
		
		char[] cr = str.toCharArray();
		
		int f =0;
		
		for(int i=0; i<=cr.length-1; i++)
		{
			char c = cr[i];
			
			for(int j=cr.length-1; j>=0; j--)
			{
				char d = cr[j];
				
				if(c==d)
				{
					f=f+1;
				}
				
			}
			
			System.out.println("Count of " +c+" : "+f);
			
		}
		
		
	}

}
