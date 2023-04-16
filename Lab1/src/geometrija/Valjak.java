package geometrija;

public class Valjak extends Telo {

	private double h= Math.random();
	public Valjak(String nazivFajla) {
		super(nazivFajla);
	}

	public double zapremina() {
		return r*r*Math.PI*h ;		
	}

}
