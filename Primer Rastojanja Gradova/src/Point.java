
public class Point {

	protected double x;
	protected double y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	/*public double izracunajRastojanje(Point p) {

		double d = Math.sqrt(Math.pow(p.x-this.x,2)-Math.pow(p.y-this.y, 2));
		return d;
	}*/
	
	public static double izracunajRastojanje(Point p1,Point p2) {

		double d = Math.sqrt(Math.pow(p1.x-p2.x,2)-Math.pow(p1.y-p2.y, 2));
		return d;
	}
	
	public void printData() {
		System.out.println("Tacka x:" + x);
		System.out.println("Tacka y:" + y);
	}
	
}
