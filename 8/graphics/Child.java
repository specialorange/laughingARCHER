package eight.graphics;

import util.annotations.Visible;

public class Child extends Avatar implements IChild{

	private int xDelta = 50;
	private int yDelta = -15;
	private ICandyContainer cC;
	private IAvatar a;
	private IPoint location = new Point();
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
		a = new Avatar(x, y, 1, 25, 15, 15);
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80);
	}
	
	public void changeLocation(int x, int y){
		this.setLocation(new Point(x,y));
		this.a.changeLocation(x, y);
		this.cC.changeLocation(x, y);
	}
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	private void setLocation(Point point) {
		this.location = point;
	}
//	Avatar and CandyContainer still need these granular functions to accomplish these methods
//	public void moveLeft(int x){
//		this.setLocation(new Point(this.location.getX()-x, this.location.getY()));
//	}
//	public void moveRight(int x){
//		this.setLocation(new Point(this.location.getX()+x, this.location.getY()));		
//	}
//	public void moveUp(int y){
//		this.setLocation(new Point(this.location.getX(), this.location.getY()-y));
//	}
//	public void moveDown(int y){
//		this.setLocation(new Point(this.location.getX(), this.location.getY()+y));		
//	}
}
