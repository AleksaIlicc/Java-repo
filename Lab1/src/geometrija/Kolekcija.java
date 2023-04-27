package geometrija;
import java.io.*;
import java.util.*;
public class Kolekcija {

	private ArrayList<Telo> lista;
	
	public Kolekcija() {
		lista= new ArrayList<Telo>();
		try {
		FileOutputStream f = new FileOutputStream("fajl.bin");
		BufferedOutputStream b= new BufferedOutputStream(f);
		DataOutputStream d= new DataOutputStream(b);
		d.writeDouble(Math.random()*10);
		d.writeDouble(0.0);
		d.writeDouble(Math.random()*10);
		d.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void ubaciTelo(Telo t) throws NultoTelo{
		if(t.r==0)
			throw new NultoTelo("r=0 za telo!");
		lista.add(t);
	}
	
	public void napraviTxtFajl(String fajl) {
	    try {
	        FileWriter fw= new FileWriter(fajl);
	        BufferedWriter bw = new BufferedWriter(fw);
	        lista.sort(null);
	        for(int i=0;i<lista.size();i++) {
	            Telo t = lista.get(i);
	            bw.write(String.valueOf(t.zapremina()));
	            bw.write(" ");
	        }
	        bw.close();
	    } catch (IOException e) {
	        System.out.println(e);
	    }
	}

	
}
