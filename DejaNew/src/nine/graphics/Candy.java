package nine.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Oval Pattern")
public class Candy implements IOval {
	private int width;
	private int height;
	private IPoint location;
	
	public Candy() {
		this.setLocation(new Point(100,100));
		this.setWidth(10);
		this.setHeight(10);
	}
	public Candy(int x, int y) {
		this.setLocation(new Point(x,y));
		this.setWidth(10);
		this.setHeight(10);
	}	
	public Candy(int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}

	public IPoint getLocation() {
		return this.location;
	}
	public void changeLocationTo(int x, int y) {
		this.setLocation(new Point(x,y));
	}
	public void changeLocationBy(int x, int y){
		this.setLocation(new Point(x+ this.getLocation().getX(), y+ this.getLocation().getY()));
	}
	public void setLocation(IPoint location) {
		this.location = location;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
}
