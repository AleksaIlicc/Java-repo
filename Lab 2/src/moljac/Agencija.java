package moljac;

import java.io.*;
import java.util.ArrayList;

public class Agencija {
	
	private ArrayList<Pisaljka> niz;
	
	public Agencija() {
		niz = new ArrayList<>();
	}
	
	public void dodajPisaljku(Pisaljka p) throws NabavnaCena {
		if(p.cena==0)
			throw new NabavnaCena("Nabavna Cena!!!");
		niz.add(p);
	}
	
	public void uknjizi(String nazivFajla) {
		niz.sort(null);
		try {
			FileWriter fw = new FileWriter(nazivFajla);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println(niz.toString());
			bw.write(niz.toString());
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
