package geometrija;
public class Lopta extends Telo{
	
	public Lopta(String nazivFajla) {
		super(nazivFajla);
	}

	public double zapremina() {
		return (4/3)*r*r*r*Math.PI;
	}
}
