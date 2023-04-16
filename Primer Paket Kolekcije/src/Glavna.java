import kolekcije.*;
public class Glavna {
	public static void main(String[] args) {
		Magacin m= new Magacin(10);
		System.out.println("da li je prazan? " + m.prazanJe());
		for(int i=0; i<10;i++) {
			m.push(10*Math.random());
		}
		
		for(int i=0; i<10;i++) {
			System.out.println(m.pop());
		}
		
		System.out.println("da li je prazan? " + m.prazanJe());
		
		
	}
}
