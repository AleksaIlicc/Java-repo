
public class Osoba implements Comparable<Osoba>{

	
	private String jmbg;
	private double visina;
	private double tezina;
	
	public Osoba(String jmbg, double visina, double tezina) {
		this.jmbg = jmbg;
		this.visina = visina;
		this.tezina = tezina;
	}

	public int compareTo(Osoba o) {
		if(this.visina < o.visina)
			return -1;
		else if(this.visina==o.visina) {
			return 0;
		}
		else return 1;
	}
	
	public String toString() {
		return "Jmbg: "+jmbg + " Visina: "+ visina + " Tezina: "+ tezina + "\n";
	}
	
	
}
