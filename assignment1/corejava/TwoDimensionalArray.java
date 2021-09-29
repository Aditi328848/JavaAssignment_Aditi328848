package assignment1.corejava;

public class TwoDimensionalArray {
	public static void main(String[] args) 
	{
		//int i=0,j=0,count=0;
		char [][] arr= new char [11][10];

		for (char k = 0; k < 11; k++)
		{
			for (int l = 0; l < 10; l++) 
			{
				arr[k][l]='I';
				//System.out.print(arr[k][l]);
			}

		}
		for (int m =1; m < 11; m++)
		{
			for (int i = 11; i >=m ; i--) 
			{
				System.out.print(" "); 
			}
			for (int p = 0; p < m; p++) 
			{

				System.out.print(arr[m][p]+" ");

			}
			System.out.println(" ");

		}

	}

}



