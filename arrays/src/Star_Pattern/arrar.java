package Star_Pattern;

public class arrar 
{
	
	public static void main(String[] args)
	{
		
		int a[] = {1,2,1,1,2};
		
		int b =0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			int c = a[i];
			
			if(c==2)
			{
				b++;
			}
			
		}
		
		System.out.println(b);
		
	}
	

}
