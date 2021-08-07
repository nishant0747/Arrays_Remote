package Star_Pattern;

public class balanced
{
	public static void main(String[] args) 
	{
		
		int a[]= {1,2,1,2,3,3,3,1};
		int c =0;
	
		int d=0;
		
		for(int i=0; i<=a.length-1; i=i+2)
		{
			int b =a[i];
			c = c+b;
		}
		

		for(int i=1; i<=a.length-1; i=i+2)
		{
			int b =a[i];
			d = d+b;
		}
		
		if(c==d)
		{
			System.out.println("balanced");
		}
		
		else
		{
			System.out.println("not balanced");
		}
		

}
}
