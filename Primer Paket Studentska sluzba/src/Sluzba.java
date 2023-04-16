
public class Sluzba {

	public static double prosek(Student s) throws NemaOcena, NemaStudenta
	{
		if(s==null) {
			throw new NemaStudenta("nema studenta!");
		}
		int[] niz = s.getOcene();
		int suma=0;
		for(int i=0; i<s.brIspita;i++) {
			suma+=niz[i];
		}
		return (double)suma/s.brIspita;
	}
	
}
