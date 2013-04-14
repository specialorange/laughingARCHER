package ass6;

public class Point implements IPoint {

	private int x;
	private int y;
//	private int angle;
//	private int radius;
	
	public Point (int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	public int getAngle() {
//		return this.angle;
//	}
//
//	public void setAngle(int angle) {
//		this.angle = angle;
//	}
//
//	public int getRadius() {
//		return this.radius;
//	}
//
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
}
