package Practise;

public class MatrixTranspose {

	public static void main(String args[]){
	int[][] m={{1,2,3}, {4,5,6}, {7,8,9}};
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++)
		{
			System.out.print(m[i][j]+"  ");
		}
		System.out.println();
	}
	
	System.out.println("Matrix Transform taking place");
	for(int i=0; i<3; i++) {
		for(int j=i+1; j<3; j++)
		{
			int temp = m[i][j];
			m[i][j] = m[j][i];
			m[j][i] = temp;
		}
	}
	
	System.out.println("Result");
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++)
		{
			System.out.print(m[i][j]+"  ");
		}
		System.out.println();
	}
	
	}
	
}
