
public class Poruka {

	private static int brojPoruka;
	private String tekst;
	
	public Poruka(String por) {
		tekst=por;
		brojPoruka++;
	}
	
	public void prikaziPoruku() {
		System.out.println(tekst);
	}
	
	public void prikaziBrPoruka() {
		System.out.println(brojPoruka);
	}
}
