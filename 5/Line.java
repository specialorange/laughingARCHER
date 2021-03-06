package ass5;
import ass5.Point;

public class Line implements ILine{

	private Point origin;
	private int width;
	private int height;
	
	public Line (int x, int y, int width, int height) {
		this.setLocation(x, y);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public Point getLocation() {
		return this.origin;
	}
	public void setLocation(int x, int y) {
		this.origin = new Point(x, y);
	}
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int newWidth) {
		this.width = newWidth;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
}
