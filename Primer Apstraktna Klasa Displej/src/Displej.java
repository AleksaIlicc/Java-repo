
public abstract class Displej {

	protected int cifra;
	
	public Displej() {
		cifra=0;
	}
	
	public Displej(int cifra) {
		if(cifra!=0 && cifra!= 1) {
			System.out.println("Unesite validnu cifru.");
			this.cifra=0;
		}else
		{
			this.cifra=cifra;
		}
	}
	
	public void resetuj() {
		cifra=0;
	}
	
	public void inkrementiraj() {
		if(cifra==0) 
			cifra++;
		else 
			cifra=0;
		
	}
	
	public abstract void stampaj();
	
}
