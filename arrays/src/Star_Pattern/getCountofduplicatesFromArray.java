package Star_Pattern;

public class getCountofduplicatesFromArray 
{
	
	public static void main(String[] args) 
	{
		
		char c [] = {'a', 'b', 'c', 'd','a','b','b','b','a'};
		
		int d =0;
		
		for(int i=0; i<=c.length-1; i++)
		{
			char e = c[i];
			
			if(e=='a')
			{
				
				d++;
			}
			
			
			
		}
	
		System.out.println(d);
	}

}
