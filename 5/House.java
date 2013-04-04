package ass5;
import ass5.Location;

public class House implements IHouse {

	private String imageFile;
	private Location point;
	private int width, height;
	private String text;
	
	public House() {
		this.setImageFileName("../Dewan/src/ass5/house.jpeg");
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Location(10,10));
		this.setText("house");
	}
	
	public House(String path) {
		this.setImageFileName(path);
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Location(10,10));
		this.setText("house");
	}

	public String getImageFileName() {return imageFile;}
	public void setImageFileName(String newVal) {imageFile = newVal;}

	public Location getLocation() {
		return this.point;
	}

	public void setLocation(Location newVal) {
		this.point = newVal;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int newVal) {
		this.width = newVal;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newVal) {
		this.height = newVal;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String newVal) {
		this.text = newVal;
	}	
}
