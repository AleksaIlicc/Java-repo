package nizovi;
import java.io.*;

public class Vektor {

	private int dim=0;
	private float vek[];
	private String fUpis;
	private String fIspis;
	
	public Vektor(String fajlUpis,String fajlIspis) {
		fUpis=fajlUpis;
		fIspis=fajlIspis;
	}
	
	public void ucitajVekTxtVer() {
		
		try {
		    FileReader fr = new FileReader(fUpis);
		    BufferedReader br = new BufferedReader(fr);
		    String niz = br.readLine();
		    dim = Integer.parseInt(niz);
		    vek= new float[dim];

		    for (int i = 0; i < dim; i++) {
		        niz = br.readLine();
		        vek[i] = Float.parseFloat(niz);
		    }
		    br.close();

		} catch (IOException e) {
		    System.out.println(e);
		}
	}
	
	public void ucitajVekTxtHor() {
		
		try 
		{
			FileReader fr = new FileReader(fUpis);
			BufferedReader br= new BufferedReader(fr);
			String niz = br.readLine();
			String[] pomNiz= niz.split(" ");
			dim=Integer.parseInt(pomNiz[0]);
			vek= new float[dim];
			for(int i =0; i<dim;i++) {
				vek[i]=Float.parseFloat(pomNiz[i+1]);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void ucitajVekBin() {
		try {
		FileInputStream fis=new FileInputStream(fUpis);
		BufferedInputStream bis= new BufferedInputStream(fis);
		DataInputStream dis= new DataInputStream(bis);
		dim=dis.readInt();
		vek=new float[dim];
		for(int i=0;i<dim;i++) {
			vek[i]=dis.readFloat();
		}
		dis.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

	public void upisiVekTxt() {
		try 
		{
			FileWriter fr= new FileWriter(fIspis);
			BufferedWriter bw= new BufferedWriter(fr);
			bw.write(dim);
			for(int i=0;i<dim;i++) {
				bw.write(Float.toString(vek[i]));
			}
			bw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

	public void upisiVekBin() {
	
		try {
			FileOutputStream fis=new FileOutputStream(fIspis);
			BufferedOutputStream bis= new BufferedOutputStream(fis);
			DataOutputStream dis= new DataOutputStream(bis);
			dis.writeInt(dim);
			for(int i=0;i<dim;i++) {
				dis.writeFloat(vek[i]);
			}
			dis.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}
	
	public void urediVektorRastuci() {
		for(int i=0;i<dim-1;i++) {
			int min=i;
			for(int j=i+1;j<dim;j++) {
				if(vek[j]<vek[min]) {
					min=j;
				}
			}
			float temp = vek[min];
            vek[min]= vek[i];
            vek[i] = temp;
		}
	}
	
	public void prikaziVektor() {
		for(int i=0;i<dim;i++) {
			System.out.println(vek[i]);
		}
		System.out.println("=-=");
	}
	
	
}
