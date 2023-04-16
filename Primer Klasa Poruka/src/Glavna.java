
public class Glavna {

	public static void main(String[] args) {
		
		Poruka p1,p2,p3;
		p1= new Poruka();
		p2= new Poruka();
		p3= new Poruka();
		
		System.out.println(p1.getBrojPoruka());
		
		p1.postavi("prva poruka");
		p2.postavi("druga poruka");
		p3.postavi("treca poruka");

		System.out.println(p1.getBrojPoruka());
		
		p1.prikazi();
		p3.prikazi();
		
	}

}
