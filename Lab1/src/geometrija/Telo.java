package geometrija;
import java.io.*;

abstract public class Telo implements Comparable<Telo> {

	private static int brTela=0;
	protected double r;
    protected static int numBytesRead = 0;  // add new variable



	public Telo(String nazivFajla){
		try {
		FileInputStream f = new FileInputStream(nazivFajla);
		BufferedInputStream b= new BufferedInputStream(f);
		DataInputStream d= new DataInputStream(b);
		d.skip(numBytesRead);
		r= d.readDouble();
		d.close();
		numBytesRead+=8;
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public int compareTo(Telo o) {
	    double thisZapremina = this.zapremina();
	    double otherZapremina = o.zapremina();
	    if (thisZapremina < otherZapremina) {
	        return -1;
	    } else if (thisZapremina > otherZapremina) {
	        return 1;
	    } else {
	        return 0;
	    }
	}
	public abstract double zapremina();
	
}
