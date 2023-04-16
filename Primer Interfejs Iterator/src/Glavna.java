public class Glavna {

	public static void main(String[] args) {

		KlasaIterator ki= new KlasaIterator();
		
		ki.dodajElement(2.788f);
		ki.dodajElement(15);
		ki.dodajElement("Aleksa");
		ki.dodajElement("Ilic");
		ki.dodajElement(55);
		
		
		System.out.println(ki.broj());
		ki.sledeci();
		ki.sledeci();
		ki.stampajTrenutni();
		for(int i=0;i < 10; i++) {
			ki.sledeci();
			ki.stampajTrenutni();
		}
		
	}

}
