package geometrija;
public class Kupa extends Telo{

	private double h=Math.random();
	public Kupa(String nazivFajla) {
		super(nazivFajla);

	}

	public double zapremina() {
		return (1/3)*h*r*r*Math.PI;
	}

}
