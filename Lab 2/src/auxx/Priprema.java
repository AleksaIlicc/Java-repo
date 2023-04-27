package auxx;

import java.io.*;

public class Priprema {
	
	public static void pripremiBinFajl(String fajl) {
		try {
			FileOutputStream fs= new FileOutputStream(fajl);
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			DataOutputStream ds = new DataOutputStream(bs);
			ds.writeInt((int) (Math.random()*50));
			ds.writeInt((int) (Math.random()*15));
			ds.writeInt(0);
			ds.writeInt((int) (Math.random()*50));
			ds.writeInt((int) (Math.random()*35));
			ds.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
	
}
