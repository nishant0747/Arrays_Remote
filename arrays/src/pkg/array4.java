package pkg;

public class array4 
{
	
	public static void main(String[] args)
	{
		
		char ty[][] = new char[3][3];
		ty[0][0]= 'A';
		ty[0][1]= 'B';
		ty[0][2]= 'C';
		ty[1][0]= 'D';
		ty[1][1]= 'E';
		ty[1][2]= 'F';
		ty[2][0]= 'G';
		ty[2][1]= 'H';
		ty[2][2]= 'I';
		
		
		
		for(int i=0; i<=2; i++) //row index 
		{
			for(int j =0; j<=2; j++)  //column index
			{
				System.out.print(ty[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
