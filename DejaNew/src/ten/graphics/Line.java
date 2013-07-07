package ten.graphics;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Line Pattern")
public class Line implements ILine{

	private IPoint location;
	private IPoint bottomLocation;
	private int width;
	private int height;
	
	public Line (int x, int y, int width, int height) {
		this.setLocation(x, y);
		this.setWidth(width);
		this.setHeight(height);
		this.setBottomLocation(new Point(x, y+height));
	}
	
	@Visible(false)
	public IPoint getBottomLocation() {
		return this.bottomLocation;
	}
	public void changeLocationBy(int x, int y) {
		this.location = new Point(x+ this.getLocation().getX(), y+this.getLocation().getY());
	}
	public void changeLocationTo(int x, int y) {
		this.location = new Point(x, y);
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(int x, int y) {
		this.location = new Point(x, y);
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
	public void setBottomLocation(IPoint bottomLocation) {
		this.bottomLocation = bottomLocation;
	}
}
