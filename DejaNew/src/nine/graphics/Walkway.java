package nine.graphics;

public class Walkway implements IRectangle, IWalkway {
	private IPoint point;
	private int width;
	private int height;

	public Walkway (int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}
	public Walkway () {
		this.setLocation(new Point(103,205));
		this.setWidth(20);
		this.setHeight(50);
	}
	
	private void setWidth(int width) {
		this.width = width;
	}
	private void setHeight(int height) {
		this.height = height;
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
	public int getHeight() {
		return this.height;
	}
}
