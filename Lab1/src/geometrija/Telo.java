package geometrija;
import java.io.*;

abstract public class Telo implements Comparable<Telo> {

	private static int brTela=0;
	protected double r;


	public Telo(String nazivFajla){
		try {
		FileInputStream f = new FileInputStream(nazivFajla);
		BufferedInputStream b= new BufferedInputStream(f);
		DataInputStream d= new DataInputStream(b);
		d.read();
		d.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public int compareTo(Telo o) {
		return 0;
	}
	public abstract double zapremina();

}
