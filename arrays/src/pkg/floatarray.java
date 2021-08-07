package pkg;

public class floatarray 

{
	public static void main(String[] args)
	{
		
		float t[][] = new float[3][3];
		t[0][0] = 23.56f;
		t[0][1] = 53.61f;
		t[0][2] = 80.6f;
		t[1][0] = 00.56f;
		t[1][1] = 74.58f;
		t[1][2] = 13.00f;
		t[2][0] = 90.64f;
		t[2][1] = 12.67f;
		t[2][2] = 13.82f;
		
		for(int f=0; f<=2; f++)
		{
			for(int i=0; i<=2; i++)
			{
				System.out.print(t[f][i]+"   ");
			}
			System.out.println();
		}
		
	}

}
