package nine.graphics;

import util.annotations.Visible;

public class Child implements IChild{

	private int xDelta = 30;
	private int yDelta = -35;
	private ICandyContainer cC;
	private IAvatar person;
	private IPoint location = new Point();
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
		person = new Avatar();
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80, 0);
	}
	
	public Child(int originX, int originY, int bodyWidth, int bodyHeight, int headWidth, int headHeight) {
		this.setLocation(new Point(originX, originY));
		this.setPerson(new Avatar(originX, originY, bodyWidth, bodyHeight, headWidth, headHeight));
		this.setcC(new CandyContainer(originX+xDelta, originY+yDelta, 12, 51, 0));
	}

	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	@Visible(false)
	public int getxDelta() {
		return this.xDelta;
	}
	@Visible(false)
	public int getyDelta() {
		return this.yDelta;
	}

	public void changeLocationTo(int x, int y){
		this.person.setLocation(new Point(x,y));
		this.person.changeLocationTo(x, y);
		this.cC.changeLocationTo(x, y);
	}
	public void changeLocationBy(int x, int y){
		this.setLocation(new Point(x,y));
		this.person.changeLocationBy(x, y);
		this.cC.changeLocationBy(x, y);
	}
	public void setLocation(Point point) {
		this.location = point;
	}
	public void setxDelta(int xDelta) {
		this.xDelta = xDelta;
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
	public IAvatar getPerson() {
		return this.person;
	}
	public void setPerson(IAvatar a) {
		this.person = a;
	}
}
