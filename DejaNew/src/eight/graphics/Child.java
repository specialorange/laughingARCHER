package eight.graphics;

import util.annotations.Visible;

public class Child extends Avatar implements IChild{

	private int xDelta = 30;
	private int yDelta = -35;
	private ICandyContainer cC;
	private IAvatar a;
	private IPoint location = new Point();
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
		a = new Avatar();
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80, 0);
	}
	
	public Child(int originX, int originY, int bodyWidth, int bodyHeight, int headWidth, int headHeight) {
		super.setLocation(new Point(originX, originY));
		super.setHead(new Oval(originX, originY, headWidth, headHeight));
		super.setBody(new Line(originX+(headWidth/2), originY+headHeight, bodyWidth, bodyHeight));
		this.setcC(new CandyContainer(originX+xDelta, originY+yDelta, 12, 51, 0));
	}

	public void changeLocation(int x, int y){
		super.setLocation(new Point(x,y));
		super.changeLocation(x, y);
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
}
