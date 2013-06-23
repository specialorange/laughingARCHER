package seven.graphics;

public class Rectangle implements IRectangle {

	private Point point;
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}
	public Point getLocation() {
		return this.point;
	}
	public void setLocation(Point point) {
		this.point = point;
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
