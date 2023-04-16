
public class RacionalanBroj {
	private int br,im;
	
	public RacionalanBroj() {
		br=1;
		im=1;
	}
	public RacionalanBroj(int br,int im) {//throws DeljenjeNulom za konstruktor
		//if(im==0) {
		//	throw new DeljenjeNulom("delis nulom");
		//}
		this.br=br;
		this.im=im;
	}
	public double vrednost() throws DeljenjeNulom {
		if(im==0) {
			throw new DeljenjeNulom("delis nulom!");
		}
		return (double)br/im;
	}

}
