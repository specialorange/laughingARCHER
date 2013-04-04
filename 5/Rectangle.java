package ass5;
import ass5.Location;

public class Rectangle implements IRectangle {

	private Location point;
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.setPoint(x, y);
		this.setWidth(width);
		this.setHeight(height);
	}
	public Location getPoint() {
		return this.point;
	}
	public void setPoint(int x, int y) {
		this.point = new Location(x,y);
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
