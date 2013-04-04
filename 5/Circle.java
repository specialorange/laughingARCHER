package ass5;

public class Circle implements ICircle {
	private int width;
	private int height;
	private Location point;
	
	public Circle() {
		this.setPoint(new Location(5,5));
		this.setWidth(30);
		this.setHeight(30);
	}
	
	public Circle(int x, int y, int width, int height) {
		this.setPoint(new Location(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}

	public Location getPoint() {
		return this.point;
	}
	public void setPoint(Location point) {
		this.point = point;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}

}
