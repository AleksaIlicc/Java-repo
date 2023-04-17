import nizovi.Vektor;

public class Glavna {

	public static void main(String[] args) {

		Vektor v1= new Vektor("Neuredjeni.txt","Uredjeni.dat");
		v1.ucitajVekTxtVer();
		v1.urediVektorRastuci();
		v1.upisiVekBin();
		
		Vektor v2= new Vektor("Uredjeni.dat","Uredjeni.txt");
		v2.ucitajVekBin();
		v2.upisiVekTxt();
		v2.prikaziVektor();
	}

}
