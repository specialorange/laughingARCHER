package eight.graphics;

import util.annotations.Visible;

public class Child extends Avatar implements IChild{

	private int xDelta = 50;
	private int yDelta = -35;
	private ICandyContainer cC;
	private IAvatar a;
	private IPoint location = new Point();
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
//		TODO Since I am extending avatar, I think I am doing this wrong, by using an avatar here
//		A Child has an avatar and a candy container
//		I think this is why the avatar circle is soooo large
		a = new Avatar(x, y, 1, 25, 15, 15);
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80, 0);
	}
	
	public Child(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
		this.setLocation(new Point(originX, originY));
		this.setCircle(new Oval(originX, originY, circleWidth, circleHeight));
		this.setPost(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));
		this.setcC(new CandyContainer(originX+xDelta, originY+yDelta, 12, 51, 0));
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
	@Visible(false)
	public int getxDelta() {
		return this.xDelta;
	}
	public void setxDelta(int xDelta) {
		this.xDelta = xDelta;
	}
	@Visible(false)
	public int getyDelta() {
		return this.yDelta;
	}
	public void setyDelta(int yDelta) {
		this.yDelta = yDelta;
	}
	public ICandyContainer getcC() {
		return this.cC;
	}
	public void setcC(ICandyContainer cC) {
		this.cC = cC;
	}
	@Visible(false)
	public IAvatar getA() {
		return this.a;
	}
	public void setA(IAvatar a) {
		this.a = a;
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
