
public class Glavna {

	public static void main(String[] args) {

		Osoba o1= new Osoba("2310002733588",184,80);
		Osoba o2= new Osoba("2302003442344",176,86);
		Osoba o3= new Osoba("2310001433221",190,89);
		
		Cekaonica c= new Cekaonica();
		
		c.dodajOsobu(o1);
		c.dodajOsobu(o2);
		c.dodajOsobu(o3);
		c.prikaziRaspored();
		
		c.rasporediPoVisini();
		c.prikaziRaspored();
		
		c.isprazniCekaonicu();
		c.prikaziRaspored();
		
	}

}
