package Star_Pattern;

public class pattern7 
{
	
	public static void main(String[] args) 
	{
		
		int star =1;
		
		for(int i=1; i<=5; i=i+2)
		{
			for(int j=1; j<=star; j=j+1)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star=star+1;
		}
		
	}

}
