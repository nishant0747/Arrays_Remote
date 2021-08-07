package pkg;

public class array3 
{
	public static void main(String[] args) 
	{
		
		int ab[][] = new int[2][3];   //[Row] [column]
		ab[0][0]= 33;
		ab[0][1]= 35;
		ab[0][2]= 37;
		ab[1][0]= 485;
		ab[1][1]= 69;
		ab[1][2]= 69;
		

		 for(int i=0; i<=1; i++)
		 {
			 for(int j=0; j<=2; j++)
			 {
				 System.out.print(ab[i][j]+" ");
			 }
			 System.out.println();
			 
		 }
		
		
		
	}
	


}
