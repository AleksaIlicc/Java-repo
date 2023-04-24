
public class Par<K extends Comparable<K>,V> implements Comparable<Par<K,V>> {

	private K kljuc;
	private V vrednost;
	
	public Par(K kljuc, V vrednost) {
		this.kljuc=kljuc;
		this.vrednost=vrednost;
	}
	
	public void setKljuc(K kljuc) {
		this.kljuc=kljuc;
	}
	
	public void setVrednost(V vrednost) {
		this.vrednost=vrednost;
	}
	
	public K getKljuc() {
		return kljuc;
	}
	
	public V getVrednost() {
		return vrednost;
	}

	public int compareTo(Par<K, V> o) {
		if (this.kljuc.compareTo(o.getKljuc())>0)
			return 1;
		else if(this.kljuc==o.kljuc)
			return 0;
		else 
			return -1;
		
	}
	
}
