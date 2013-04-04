package ass5;
import ass5.Location;

public class Line implements ILine{

	private Location origin;
	private int width;
	private int height;
	
	public Line (int x, int y, int width, int height) {
		this.setPoint(x, y);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public Location getPoint() {
		return this.origin;
	}
	public void setPoint(int x, int y) {
		this.origin = new Location(x, y);
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
