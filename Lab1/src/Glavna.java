import geometrija.*;
public class Glavna {
	public static void main(String[] args) {
				
		Kolekcija kolek = new Kolekcija();
		Lopta l = new Lopta("fajl.bin");
		Valjak v = new Valjak("fajl.bin");
		Kupa k= new Kupa("fajl.bin");
		
		try {
			kolek.ubaciTelo(v);
		} catch (NultoTelo e) {
			System.out.println(e);
		}
		try {
			kolek.ubaciTelo(l);
		} catch (NultoTelo e) {
			System.out.println(e);
		}
		try {
			kolek.ubaciTelo(k);
		} catch (NultoTelo e) {
			System.out.println(e);
		}finally {
			kolek.napraviTxtFajl("finalni.txt");
		}
		
		
	}
}
