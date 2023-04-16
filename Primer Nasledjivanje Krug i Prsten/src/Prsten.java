
public class Prsten extends Krug {

	private double poluprecnik;
	
	public Prsten(double r1, double r2) {
		super(r1);
		this.poluprecnik=r2;
	}
	
	public double izracunajPovrsinu() {
		System.out.println("Prstenova pov");
		return super.izracunajPovrsinu()-Math.pow(poluprecnik, 2)* Math.PI;
	}
	
}
