package ass6;

public class Candy implements IOval {
	private int width;
	private int height;
	private Point location;
	
	public Candy() {
		this.setLocation(new Point(100,100));
		this.setWidth(100);
		this.setHeight(100);
	}
	
	public Candy(int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}

	public Point getLocation() {
		return this.location;
	}
	public void setLocation(Point location) {
		this.location = location;
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
