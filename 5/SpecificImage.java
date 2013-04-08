package ass5;
import ass5.ISpecificImage;
import ass5.Point;


public class SpecificImage implements ISpecificImage{
	
	private String imageFileName = "/Dewan/src/ass5/house.jpeg";
	private int width = 204;
	private int height = 204;
	private Point point;
	
	public SpecificImage(int placementX, int placementY) {
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
