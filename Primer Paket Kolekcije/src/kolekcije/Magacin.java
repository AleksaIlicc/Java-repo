package kolekcije;

public class Magacin {

	private Object[] niz;
	private int brEl;
	private int trEl;
	
	public Magacin(){
		brEl=10;
		niz= new Object[brEl];
		trEl=0;		
	}
	public Magacin(int kapacitet){
		brEl=kapacitet;
		niz= new Object[brEl];
		trEl=0;		
	}
	public void push(Object o) {
		if(trEl<brEl) {
		niz[trEl++]=o;
		}
	}
	public Object pop() {
		if(!prazanJe()) {
			trEl--;
			return niz[trEl];
		}
		return null;
	}
	public boolean prazanJe() {
		return trEl==0;
	}
}
