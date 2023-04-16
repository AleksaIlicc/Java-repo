
public class Glavna {

	public static void main(String[] args) {

		ShapeFactory sf=new ShapeFactory();
		sf.ExecuteDraw("square");
		sf.ExecuteDraw(null);
		sf.ExecuteDraw("random");
	}

}
