
public class Krug {

	double poluprecnik;
	
	public Krug(double pp) {
		poluprecnik = pp;
	}
	
	public double izracunajPovrsinu() {
		System.out.println("Krugova pov");
		return Math.pow(poluprecnik, 2)* Math.PI;
	}
	
}
