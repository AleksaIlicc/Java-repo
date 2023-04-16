
public class Glavna {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=null;
		
		int[] ocene=new int[Student.brIspita];
		for(int i=0; i<Student.brIspita;i++) {
			ocene[i] = (int)(Math.random()*6+5);
		}
		Student s3 = new Student("Aleksa","Ilic", ocene);
		try {
		System.out.println(Sluzba.prosek(s3));
		} catch (NemaOcena no) {
			System.out.println(no);
		}
		catch(NemaStudenta ns) {
			System.out.println(ns);
		}
		
	}
}
