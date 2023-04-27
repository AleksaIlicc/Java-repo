package moljac;

import java.io.*;

public abstract class Pisaljka implements Comparable<Pisaljka>{

	protected int cena;
	private static int numOfBytes=0;
	
	public Pisaljka(String fajl) {
		try {
			FileInputStream fs= new FileInputStream(fajl);
			BufferedInputStream bs = new BufferedInputStream(fs);
			DataInputStream ds = new DataInputStream(bs);
			ds.skip(numOfBytes);
			cena=ds.readInt();
			numOfBytes+=4;
			ds.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public int compareTo(Pisaljka p) {
		int thisUV=upotrebnaVrednost();
		int drugiUV= p.upotrebnaVrednost();
		if(thisUV>drugiUV)
			return 1;
		else if(thisUV==drugiUV)
			return 0;
		else 
			return -1;
	}
	
	abstract int upotrebnaVrednost();
	
	public String toString() {
		return String.valueOf(upotrebnaVrednost());	}
	
}
