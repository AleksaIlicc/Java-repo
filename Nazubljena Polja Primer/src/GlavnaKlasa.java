
public class GlavnaKlasa {
	
	
	public static void main(String[] args) {
		
		int mat[][]=new int[5][];
		for (int i =0; i<mat.length;i++)
		{
			mat[i]= new int[i+1];
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=1;
			}
		}
		
		for(int i=0; i < mat.length; i++) 
		{
			for(int j=0; j< mat[i].length;j++) 
			{		
				System.out.println(mat[i][j]);
			}
		System.out.print("\n");
		}
	
	
	}
	
}
