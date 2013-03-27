package ass5;

public class Rectangle implements RectangleInterface {

	private PointInterface point;
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		setWidth(width);
		setHeight(height);
		setPoint(x, y);
	}
	public PointInterface getPoint() {
		return this.point;
	}
	public void setPoint(int x, int y) {
		this.point = new Point(x,y);
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
