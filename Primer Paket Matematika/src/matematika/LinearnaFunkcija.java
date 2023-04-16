package matematika;

public class LinearnaFunkcija implements Funkcija{

	//y=ax+b;
	private double a,b,c;
	public LinearnaFunkcija() {
		a=0;
		b=0;
	}
	
	public LinearnaFunkcija(double a,double b) {
		this.a=a;
		this.b=b;
	}
	
	public double izracunajVrednost(double tacka) {
		return a*tacka+b;
	}

	
	public boolean daLiFunkcijaImaRealneNule() {
		return a!=0;
	}

	
	public double[] nule() {
		if (daLiFunkcijaImaRealneNule()) {
			double[] niz = new double[1];
			niz[0]=-b/a;
			return niz;
		}
		return null;
		
	}

}
