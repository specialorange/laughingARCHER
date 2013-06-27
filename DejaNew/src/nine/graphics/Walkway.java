package nine.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Rectangle Pattern")
public class Walkway implements IRectangle, IWalkway {
	private IPoint location, upperLeft, upperRight, lowerLeft, lowerRight;
	private int width;
	private int height;

	public Walkway (int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
		this.setUpperLeft(new Point(x,y));
		this.setUpperRight(new Point(x+width,y));
		this.setLowerLeft(new Point(x,y+height));
		this.setLowerRight(new Point(x+width,y+height));
	}
	public Walkway () {
		this.setLocation(new Point(103,205));
		this.setWidth(20);
		this.setHeight(50);
		this.setUpperLeft(new Point(103,205));
		this.setUpperRight(new Point(123,205));
		this.setLowerLeft(new Point(103,255));
		this.setLowerRight(new Point(123,255));
	}
	
	public IPoint getUpperLeft() {
		return this.upperLeft;
	}
	public void setUpperLeft(IPoint upperLeft) {
		this.upperLeft = upperLeft;
	}
	public IPoint getUpperRight() {
		return this.upperRight;
	}
	public void setUpperRight(IPoint upperRight) {
		this.upperRight = upperRight;
	}
	public IPoint getLowerLeft() {
		return this.lowerLeft;
	}
	public void setLowerLeft(IPoint lowerLeft) {
		this.lowerLeft = lowerLeft;
	}
	public IPoint getLowerRight() {
		return this.lowerRight;
	}
	public void setLowerRight(IPoint lowerRight) {
		this.lowerRight = lowerRight;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
}
