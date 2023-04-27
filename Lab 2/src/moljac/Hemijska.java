package moljac;

public class Hemijska extends Pisaljka {

	public Hemijska(String fajl) {
		super(fajl);
	}

	@Override
	int upotrebnaVrednost() {
		return cena*3;
	}

}
