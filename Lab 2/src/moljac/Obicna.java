package moljac;

public class Obicna extends Pisaljka{

	public Obicna(String fajl) {
		super(fajl);
	}
	
	@Override
	int upotrebnaVrednost() {
		return cena*2;		
	}

}
