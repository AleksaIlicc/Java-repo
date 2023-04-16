
public class ShapeFactory {

	private Shape getShape(String shapeType) {
		if(shapeType== null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		else 
			return null;
		
	}
	
	public void ExecuteDraw(String shapeType) {
		Shape s= getShape(shapeType);
		if(s!=null) {
			s.draw();
		}
	}
}
