package Star_Pattern;

public class pattern17 
{
	
	public static void main(String[] args) 
	{
		
		int a[] = {234, 678, 2, 3423, 100, 34, 480, 78, 507, 510};
		
		int b;
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				
				
				if(a[i]<a[j])
				{
					b=a[i];
					a[i]= a[j];
					a[j]= b;
					
				}
			}
		}
		
		System.out.println(a[2]);
		
		
		
		
	}

}
