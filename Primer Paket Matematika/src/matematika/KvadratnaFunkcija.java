package matematika;

public class KvadratnaFunkcija implements Funkcija{

	//y=ax*x+bx+c;
	
	public double a,b,c;
	
	public KvadratnaFunkcija() {
		a=0;
		b=0;
		c=0;
	}
	
	public KvadratnaFunkcija(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double izracunajVrednost(double tacka) {
		return a*tacka*tacka+b*tacka+c;
	}

	
	public boolean daLiFunkcijaImaRealneNule() {
		return (b*b-4*a*c)>=0;
	}

	
	public double[] nule() {
		if(daLiFunkcijaImaRealneNule()) {
			if((b*b-4*a*c)==0) {
				double niz[]=new double[1];
				niz[0]=-(b/2*a);
				return niz;
				
			}
			else
			{
				double niz[]=new double[2];
				niz[0]=(-b+Math.sqrt(b*b-4*a*c))/2*a;
				niz[1]=(-b-Math.sqrt(b*b-4*a*c))/2*a;
				return niz;
			}
		}
		return null;
	}

}
