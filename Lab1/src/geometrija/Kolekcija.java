package geometrija;
import java.io.*;
import java.util.*;
public class Kolekcija {

	private ArrayList<Telo> lista;
	
	public Kolekcija() {
		try {
		FileOutputStream f = new FileOutputStream("fajl.bin");
		BufferedOutputStream b= new BufferedOutputStream(f);
		DataOutputStream d= new DataOutputStream(b);
		d.writeDouble(Math.random()*10);
		d.writeDouble(Math.random()*10);
		d.writeDouble(Math.random()*10);
		d.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
}
