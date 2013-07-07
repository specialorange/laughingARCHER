package ten.graphics;

public class SpecificImage implements ISpecificImage{
	
	private String imageFileName = "/Dewan/src/ass5/house.jpeg";
	private int width = 204;
	private int height = 204;
	private IPoint point;
	
	public SpecificImage(int placementX, int placementY) {
		Point location = new Point(placementX, placementY);
		this.setLocation(location);
	}
	public void setLocation(IPoint newVal) {
		this.point = newVal;
	}
	public IPoint getLocation() {
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
