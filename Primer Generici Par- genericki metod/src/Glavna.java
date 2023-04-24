
public class Glavna {
	
	public static void main(String[] args) {
		
		Par<Integer,Integer> p1= new Par<>(2,5);
		Par<Integer,String> p2= new Par<>(2,"string");
		Par<Integer,Integer> p3= new Par<>(2,5);
		Par<Integer,Integer> p4= new Par<>(1,3);


		
		//Alat.istiSu(p1, p2);
		System.out.println(Alat.istiSu(p1, p3));
		System.out.println(Alat.istiSu(p1, p4)); 
		
		Par<Integer,Integer> [] nizParova;
		nizParova= new Par[3];
		nizParova[0]=p1;
		nizParova[1]=p3;
		nizParova[2]=p4;
		System.out.println(Alat.izbrojiAkoJeVece(nizParova, p4));
	}
	
}
