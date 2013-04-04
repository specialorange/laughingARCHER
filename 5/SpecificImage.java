package ass5;
import ass5.ISpecificImage;
import ass5.Location;


public class SpecificImage implements ISpecificImage{
	
	private String imageFileName = "/Dewan/src/ass5/house.jpeg";
	private int width = 204;
	private int height = 204;
	private Location point;
	
	public SpecificImage(int placementX, int placementY) {
		Location location = new Location(placementX, placementY);
		this.setLocation(location);
	}
	public void setLocation(Location newVal) {
		this.point = newVal;
	}
	public Location getLocation() {
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
