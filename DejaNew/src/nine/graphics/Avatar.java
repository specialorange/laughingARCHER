package nine.graphics;

import util.annotations.Visible;

public class Avatar implements IAvatar{

	private IOval head;
	private ILine body;
	private IPoint location;
	
	public Avatar() {
		this.setLocation(new Point(100, 100));
		this.setHead(new Oval());
		this.setBody(new Line(110, 120, 0, 30));
	}
	public Avatar(int x, int y) {
		this.setLocation(new Point(x, y));
		this.setHead(new Oval(x, y, this.getHead().getWidth(), this.getHead().getHeight()));
		this.setBody(new Line(x+(this.getHead().getWidth()/2), y+this.getHead().getHeight(), 1, 15));
	}
	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
		this.setLocation(new Point(originX, originY));
		this.setHead(new Oval(originX, originY, circleWidth, circleHeight));
		this.setBody(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));
	}

	public void setLocation(int x, int y) {
	}
	public void changeLocationTo(int x, int y) {
		this.setHead(new Oval(x, y, this.getHead().getWidth(), this.getHead().getHeight()));
		this.setBody(new Line(x, y, this.getBody().getWidth(), this.getBody().getHeight()));
	}
	public void changeLocationBy(int x, int y) {
		this.setHead(new Oval(x+this.getHead().getLocation().getX(), y+this.getHead().getLocation().getY(), this.getHead().getWidth(), this.getHead().getHeight()));
		this.setBody(new Line(x+this.getBody().getLocation().getX(), y+this.getBody().getLocation().getY(), this.getBody().getWidth(), this.getBody().getHeight()));
	}
	public void setHead(IOval circle) {
		this.head = circle;
	}
	public IOval getHead() {
		return this.head;
	}
	public ILine getBody() {
		return this.body;
	}
	public void setBody(ILine post) {
		this.body = post;
	}
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint location) {
		this.location = location;
	}
	@Override
	public void setLocation(Point point) {
		this.location = point;
	}
}
