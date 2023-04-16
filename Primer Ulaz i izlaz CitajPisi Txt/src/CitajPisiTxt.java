import java.io.*;
import java.util.Scanner;
public class CitajPisiTxt {

	private String red="nista nije ucitano";
	
	public void citaj(String fajlIme) {
		try {
			FileReader f = new FileReader(fajlIme);
			BufferedReader b = new BufferedReader(f);
			red = b.readLine();
			b.close();
		} catch(IOException iz){
			System.out.println(iz);
		} finally {
			System.out.println(red);
		}
		
	}
	
	public void pisi(String imeFajla) {
		try {
		FileWriter f = new FileWriter(imeFajla);
		BufferedWriter b = new BufferedWriter(f);
		Scanner obj= new Scanner(System.in);
		String upisano = obj.nextLine();
		//System.out.println(upisano);
		b.write(upisano);
		b.close();
		obj.close();
		} 
		catch(IOException iz) {
			System.out.println(iz);
		}
	}
}
