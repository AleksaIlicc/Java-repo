
public class Student {
	private String ime;
	private String prezime;
	public static int brIspita=35;
	private int[] ocene;	
	
	public Student(String ime,String prezime, int[] oc) {
		this.ime=ime;
		this.prezime=prezime;
		ocene = oc;
	}
	
	public Student() {
	}

	public int[] getOcene() throws NemaOcena 
	{
		if(ocene==null) {
			throw new NemaOcena("nema ocena!");
		}
		return ocene;
	}
}
