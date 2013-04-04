package ass5;

public class Oval implements IOval {
	private int width;
	private int height;
	private Location point;
	
	public Oval() {
		this.setPoint(new Location(100,100));
		this.setWidth(100);
		this.setHeight(100);
	}
	
	public Oval(int x, int y, int width, int height) {
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
