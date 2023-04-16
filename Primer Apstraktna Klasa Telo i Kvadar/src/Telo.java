
public abstract class Telo {

	protected double baza;
	protected double visina;
	
	public Telo() {
		baza=visina=1;
	}
	
	public Telo(double baza,double visina) {
		this.baza=baza;
		this.visina=visina;
	}
	
	public void dim() {
		System.out.println(baza + " " + visina);
	}
	
	public abstract double zapremina();
	
}
