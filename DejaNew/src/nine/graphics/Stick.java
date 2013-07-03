package nine.graphics;

import nine.graphics.Line;

public abstract class Stick implements IStick {

	private IPoint location;
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
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
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
