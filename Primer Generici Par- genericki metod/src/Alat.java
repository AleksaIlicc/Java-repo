
public class Alat {

	public static <K extends Comparable<K>,V>boolean istiSu(Par <K,V>p1, Par <K,V>p2) {
		return p1.getKljuc().equals(p2.getKljuc()) && p1.getVrednost().equals(p2.getVrednost());
	}
	
	public static <T extends Comparable<T>>int izbrojiAkoJeVece(T[] niz, T elem) {
		int broj =0;
		
		for(T e: niz) {
			if(e.compareTo(elem)>0) 
				broj++;
			
		}
		return broj;
	
	}
	
}
