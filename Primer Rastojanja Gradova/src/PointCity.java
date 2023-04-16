
public class PointCity extends Point {

	private String naziv;
	private int brojStanovnika;
	
	public PointCity() {
		naziv="No Info";
		brojStanovnika=0;
	}
	
	public PointCity(String naziv, int brStan, double x, double y) {
		
		super(x,y);
		this.naziv=naziv;
		brojStanovnika=brStan;
		
	}
	
	public void printData() {
		super.printData();
		System.out.println("Naziv grada: " + naziv);
		System.out.println("Ukupan broj stanovnika: " + brojStanovnika);
	}
	
}
