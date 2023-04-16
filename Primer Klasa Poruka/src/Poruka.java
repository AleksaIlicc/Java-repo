
public class Poruka {

	private String tekst;
	private static int brojPoruka=0;
	
	public void postavi(String por) {
		tekst=por;
		brojPoruka++;
	}
	
	public void prikazi() {
		System.out.println(tekst);
	}
	
	public int getBrojPoruka(){
		return brojPoruka;
	}
	
}
