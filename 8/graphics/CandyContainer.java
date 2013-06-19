package eight.graphics;

import util.annotations.Visible;

public class CandyContainer implements ICandyContainer {

	private IPoint 	location;
	private ILine 	left, right, bottom;
	private int 	width, height;
	private ICandyList candyList;
	
	public CandyContainer(int x, int y, int width, int height) {
		this.setLocation(new Point(x, y));
		this.setLeft(new Line(x, y, 0, height));
		this.setRight(new Line(x+width, y, 0, height));
		this.setBottom(new Line(x, y+height, width, 0));
		this.setCandyList(new CandyList(width, height, this.getLocation(), 2));
	}

	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public void changeLocation(int x, int y) {
		this.location = new Point(x,y);
	}
	@Visible(false)
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Visible(false)
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
	public ICandyList getCandyList() {
		return this.candyList;
	}
	public void setCandyList(ICandyList candyList) {
		this.candyList = candyList;
	}
}
