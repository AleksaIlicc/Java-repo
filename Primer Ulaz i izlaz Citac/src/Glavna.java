import java.io.*;
import ulaziizlaz.*;
public class Glavna {

	public static void main(String[] args) {

		float nizFloat[] = null;
		double nizDouble[]=null;
		int brFloat = 0,brDouble=0;
		FileReader fr;
		try {
			fr = new FileReader("Fniz.txt");
			Citac c= new Citac(fr);
			brFloat = c.procitajInt();
			nizFloat = new float[brFloat];
			for(int i=0;i<brFloat;i++) {
				nizFloat[i]=c.procitajFloat();
			}
			c.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			for(int i=0;i<brFloat;i++) {
				
				System.out.print(nizFloat[i] + " ");
			}
			System.out.println();
		}
		
		try {
			InputStreamReader scan= new InputStreamReader(System.in);			
			Citac c= new Citac(scan);
			brDouble = c.procitajInt();
			nizDouble = new double[brDouble];
			for(int i=0;i<brDouble;i++) {
				nizDouble[i]=c.procitajFloat();
			}
			c.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			for(int i=0;i<brDouble;i++) {
				System.out.print(nizDouble[i] + " ");
			}
			System.out.println();
		}
		
		
	}

}
