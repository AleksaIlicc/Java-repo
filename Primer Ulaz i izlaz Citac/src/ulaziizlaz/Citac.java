package ulaziizlaz;
import java.io.*;
public class Citac extends BufferedReader{

	public Citac(Reader in) {
		super(in);
	}
	
	public int procitajInt() throws NumberFormatException, IOException {
		return Integer.parseInt(super.readLine());
	}
	public float procitajFloat() throws NumberFormatException, IOException {
		return Float.parseFloat(super.readLine());
	}
	public double procitajDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(super.readLine());
	}

}
