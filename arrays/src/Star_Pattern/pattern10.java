package Star_Pattern;

public class pattern10 
{
	
	public static void main(String[] args) 
	{
		
		int space=0;
		int star =1;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		//	space++;
			
			if(i<=4)
			{
				space++;
			}
			
			else 
			{
				space--;
				
			}
			
		}
		
		
	}

}