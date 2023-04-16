
public class MatricniDisplej extends Displej{

	private char mat[][][];
		
	
	public MatricniDisplej() {
		super();
		
		mat=new char[3][5][2];
		
		popuniMatricu();

	}
	
	public MatricniDisplej(int cifra) {
		super(cifra);
		
		mat=new char[3][5][2];
		
		popuniMatricu();


	}

	public void stampaj() {
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(mat[j][i][cifra] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void popuniMatricu() {
		
		mat[0][0][0]='§';
		mat[0][1][0]='§';
		mat[0][2][0]='§';
		mat[0][3][0]='§';
		mat[0][4][0]='§';
		
		mat[1][0][0]='§';
		mat[1][1][0]='.';
		mat[1][2][0]='.';
		mat[1][3][0]='.';
		mat[1][4][0]='§';
		
		mat[2][0][0]='§';
		mat[2][1][0]='§';
		mat[2][2][0]='§';
		mat[2][3][0]='§';
		mat[2][4][0]='§';
		
		mat[0][0][1]='.';
		mat[0][1][1]='.';
		mat[0][2][1]='.';
		mat[0][3][1]='.';
		mat[0][4][1]='.';
		
		mat[1][0][1]='.';
		mat[1][1][1]='.';
		mat[1][2][1]='.';
		mat[1][3][1]='.';
		mat[1][4][1]='.';
		
		mat[2][0][1]='§';
		mat[2][1][1]='§';
		mat[2][2][1]='§';
		mat[2][3][1]='§';
		mat[2][4][1]='§';
		
	}
}
