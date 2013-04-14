package ass6;

public class CandyContainer implements ICandyContainer {

	private Point point;
	private Line left;
	private Line right;
	private Line bottom;
	private int width;
	private int height;
	
	public CandyContainer(int x, int y, int width, int height) {
		this.setLocation(new Point(x, y));
		this.left = new Line(x, y, 0, height);
		this.right = new Line(x+width, y, 0, height);
		this.bottom = new Line(x, y+height, width, 0);
	}
	
	public Point getLocation() {
		return this.point;
	}
	public void setLocation(Point point) {
		this.point = point;
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

}
