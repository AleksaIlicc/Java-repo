import auxx.*;
import moljac.*;

public class Glavna {

	public static void main(String[] args) {
		
		Priprema.pripremiBinFajl("fajl.bin");
		
		Agencija agen = new Agencija();
		
		Hemijska h= new Hemijska("fajl.bin");
		Obicna o= new Obicna("fajl.bin");
		Penkalo p= new Penkalo("fajl.bin");
		Penkalo p2= new Penkalo("fajl.bin");		

		
		try {
			agen.dodajPisaljku(h);
		} catch (NabavnaCena e) {
			System.out.println(e);
		}
		try {
			agen.dodajPisaljku(o);
		} catch (NabavnaCena e) {
			System.out.println(e);
		}
		try {
			agen.dodajPisaljku(p);
		} catch (NabavnaCena e) {
			System.out.println(e);
		}
		try {
			agen.dodajPisaljku(p2);
		} catch (NabavnaCena e) {
			System.out.println(e);
		}
		finally {
			agen.uknjizi("ukljizeno.txt");
		}
		
		
	}
	
}
