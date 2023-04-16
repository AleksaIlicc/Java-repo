
public class Glavna {

	public static void main(String[] args) {

		Displej D,DM;
		
		D= new ObicniDisplej(1);
		D.inkrementiraj();
		D.stampaj();
		
		
		DM=new MatricniDisplej(0);
		DM.stampaj();
		
		
	}

}
