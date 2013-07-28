package eleven.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Rectangle Pattern")
public class Rectangle implements IRectangle {

	private IPoint location;
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public void changeLocationBy(int x, int y) {
		this.location.changeLocationBy(x, y);
	}
	public void changeLocationTo(int x, int y) {
		this.location.changeLocationTo(x, y);
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
