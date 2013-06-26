package nine.graphics;

public class Oval implements IOval {
	private int width;
	private int height;
	private IPoint location;
	
	public Oval() {
		this.setLocation(new Point(100,100));
		this.setWidth(100);
		this.setHeight(100);
	}
	
	public Oval(int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}

	public void changeLocation(int x, int y) {
		this.location = new Point(x,y);
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint location) {
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
