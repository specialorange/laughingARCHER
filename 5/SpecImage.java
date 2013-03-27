package ass5;
import ass5.SpecImageInterface;
import ass5.Point;

public class SpecImage implements SpecImageInterface{
	
	private String imageFileName = "/Dewan/src/ass5/house.jpeg";
	private int width = 204;
	private int height = 204;
	private Point point;
	
	public SpecImage(int placementX, int placementY) {
		Point location = new Point(placementX, placementY);
		this.setLocation(location);
	}
	public void setLocation(Point newVal) {
		this.point = newVal;
	}
	public Point getLocation() {
		return this.point;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public String getImageFileName() {
		return this.imageFileName;
	}
}
