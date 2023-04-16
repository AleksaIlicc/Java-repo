
public class Glavna {

	public static void main(String[] args) {

		PointCity cp1,cp2;
		
		cp1= new PointCity("Nis", 350000, 871.5,-933.1);
		cp2= new PointCity("Beograd", 2000000,160.2,-655.8);
		
		cp1.printData();
		cp2.printData();
		
		System.out.println(PointCity.izracunajRastojanje(cp1,cp2));
		
	}

}
