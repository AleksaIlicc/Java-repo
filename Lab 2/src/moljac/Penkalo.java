package moljac;

public class Penkalo extends Pisaljka{

	public Penkalo(String fajl) {
		super(fajl);
	}

	@Override
	int upotrebnaVrednost() {
		int ran=(int) (Math.random()*3);
		if(ran<1)
			ran+=1;
		return ran;
	}

}
