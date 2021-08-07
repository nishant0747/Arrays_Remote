package pkg;
// 
public class MultiDimensional 
{
	public static void main(String[] args) {
		
		
		  //JAVA FLOAT ARRAY DECLARATION

	    

	    //MEMORY ALLOCATION FOR JAVA FLOAT ARRAY

	    float f[] = new float[4];

	    //ASSIGNING ELEMENTS TO JAVA FLOAT ARRAY

	    f[0] = 10.10f;

	    f[1] = 30.3f;

	    f[2] = 40.60f;

	    f[3] = 77.50f;

	    //JAVA FLOAT ARRAY OUTPUT


	    for(int i=0;i<=f.length-1; i++)
	    {
	    	System.out.println(f[i]);
	    }
		
		System.out.println("------2x3 array------");
		int ar1[][] = new int [2][3];
		ar1[0][0]=10;
		ar1[0][1]=20;
		ar1[0][2]=58;
		ar1[1][0]=30;
		ar1[1][1]=40;
		ar1[1][2]=456;

		// 2<=1
		for (int i = 0; i <= 1; i++) {
			// 3<=2
			for (int j = 0; j <= 2; j++) { // 0 2
				System.out.print(ar1[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	}





