
public class KlasaIterator implements Iterator {

	private Object[] niz;
	private int ukupnoDodatih;
	private int trEl;
	private int maxEl;
	
	public KlasaIterator() {
		maxEl=10;
		niz=new Object[maxEl];
		trEl=0;
		ukupnoDodatih=0;
	}
	
	public KlasaIterator(int max) {
		maxEl=max;
		niz=new Object[maxEl];
		trEl=0;
		ukupnoDodatih=0;
	}
	
	public int broj() {
		return ukupnoDodatih;
	}

	public void dodajElement(int el) {
		niz[ukupnoDodatih]=el;
		ukupnoDodatih++;
	}


	public void dodajElement(String el) {
		niz[ukupnoDodatih]=el;
		ukupnoDodatih++;
	}


	public void dodajElement(float el) {
		niz[ukupnoDodatih]=el;
		ukupnoDodatih++;
	}


	public void stampajTrenutni() {
		System.out.println(niz[trEl] + " ");
	}

	public void sledeci() {
		if(trEl==maxEl-1)
			trEl=0;
		else
			trEl++;
	}

	public void naPocetak() {
		trEl=0;
	}
	
}
