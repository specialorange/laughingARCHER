package nine.graphics;

import nine.graphics.Line;

public class Stick implements IStick {

	private ILine bottom;
	
	public Stick(){
		this.setLocation(new Point(100, 100));
		this.setBottom(new Line(100, 100, 0, 30));		
	}
	
	public Stick(int x, int y){
		this.setLocation(new Point(x, y));
		this.setBottom(new Line(x, y, 0, 30));		
	}
	
	public Stick(int x, int y, int width, int height){
		this.setLocation(new Point(x, y));
		this.setBottom(new Line(x, y, width, height));
	}
	
	public IPoint getLocation() {
		return null;
	}
	public void setLocation(IPoint point) {
	}
	public int getWidth() {
		return 0;
	}
	public void setWidth(int newVal) {
	}
	public int getHeight() {
		return 0;
	}
	public void setHeight(int newVal) {
	}
	public ILine getBottom() {
		return this.bottom;
	}
	public void setBottom(ILine bottom) {
		this.bottom = bottom;
	}
	public IPoint getFeetLocation() {
		return this.getBottom().getBottomLocation();
	}
}
