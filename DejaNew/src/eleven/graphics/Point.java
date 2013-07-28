package eleven.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Point Pattern")
public class Point implements IPoint {
	private int x;
	private int y;
	
	public Point (int x, int y) {
		setX(x);
		setY(y);
	}

	public void changeLocationTo(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void changeLocationBy(int x, int y){
		this.x = this.x + x;
		this.y = this.y + y;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
