import matematika.*;

public class Glavna {

	public static void main(String[] args) {

		Funkcija f1,f2;
		f1= new LinearnaFunkcija(2,4);
		System.out.println(f1.daLiFunkcijaImaRealneNule());
		System.out.println(f1.izracunajVrednost(1));
		double nule[]=f1.nule();
		for(int i=0;i<nule.length;i++) {
			System.out.println(nule[i]);
		}
		
		System.out.println("                ");
		
		f2= new KvadratnaFunkcija(1.1,5.5,500);
		
		System.out.println(f2.daLiFunkcijaImaRealneNule());
		System.out.println(f2.izracunajVrednost(1));
		
		double nule2[]=f2.nule();
		for(int i=0;i<nule2.length;i++) {
			System.out.println(nule2[i]);
		}
			
		
	}

}
