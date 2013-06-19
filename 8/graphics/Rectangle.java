package eight.graphics;

public class Rectangle implements IRectangle {

	private IPoint point;
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}
	public IPoint getLocation() {
		return this.point;
	}
	public void setLocation(IPoint point) {
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
