package eight.graphics;

public class CandyContainer implements ICandyContainer {

	private IPoint 	location = new Point();
	private ILine 	left, right, bottom;
	private int 	width, height;
	
	public CandyContainer(int x, int y, int width, int height) {
		this.setLocation(new Point(x, y));
		this.setLeft(new Line(x, y, 0, height));
		this.setRight(new Line(x+width, y, 0, height));
		this.setBottom(new Line(x, y+height, width, 0));
	}
	
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(Point point) {
		this.location = point;
	}
	public void changeLocation(int x, int y) {
		this.location = new Point(x,y);
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
	public ILine getLeft() {
		return this.left;
	}
	public void setLeft(Line left) {
		this.left = left;
	}
	public ILine getRight() {
		return this.right;
	}
	public void setRight(Line right) {
		this.right = right;
	}
	public ILine getBottom() {
		return bottom;
	}
	public void setBottom(Line bottom) {
		this.bottom = bottom;
	}
}
