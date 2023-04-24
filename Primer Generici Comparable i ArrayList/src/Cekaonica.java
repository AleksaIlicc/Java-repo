import java.util.*;

public class Cekaonica {

	ArrayList<Osoba> l = new ArrayList<>();
	
	public void dodajOsobu(Osoba o) {
		l.add(o);
	}
	
	public void rasporediPoVisini() {
		l.sort(null);
	}
	
	public void isprazniCekaonicu() {
		l.removeAll(l);
	}
	
	public void prikaziRaspored() {
		System.out.println(l);
		System.out.println("=======");
	}
	
}
