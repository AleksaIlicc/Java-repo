import java.io.*;
public class CitajPisiBin {
	public void upis() {
		try {
			FileOutputStream f = new FileOutputStream("fajl.bin");
			BufferedOutputStream b= new BufferedOutputStream(f);
			DataOutputStream d= new DataOutputStream(b);
			d.writeInt(5);
			d.writeDouble(2.9);
			d.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public void citanje() {
		try {
			FileInputStream f = new FileInputStream("fajl.bin");
			BufferedInputStream b= new BufferedInputStream(f);
			DataInputStream d= new DataInputStream(b);
			int celibr = d.readInt();
			double realniD= d.readDouble();
			System.out.println(celibr + " " + realniD);
			d.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
		
}
