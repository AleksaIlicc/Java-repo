
public class Glavna {
public static void main(String[] args) {
//	try {
//		RacionalanBroj rb1= new RacionalanBroj(5,0);
//	} catch (DeljenjeNulom e) {
//		System.out.println(e);
//	} catch (Exception e) {
//		System.out.println(e);
//	}
	
	RacionalanBroj rb1= new RacionalanBroj(4,0);
	try {
		double vred=rb1.vrednost();
		System.out.println(vred);
	} catch (DeljenjeNulom e) {
		System.out.println(e);
	}
}
}
