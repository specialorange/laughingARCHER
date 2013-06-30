package nine.graphics;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Avatar extends Stick implements IAvatar{

	private IOval head;
	
	public Avatar() {
		super.setLocation(new Point(100, 100));
		super.setBottom(new Line(110, 120, 0, 30));
		this.setHead(new Oval());
	}
	public Avatar(int x, int y) {
		super.setLocation(new Point(x, y));
		super.setBottom(new Line(x+(this.getHead().getWidth()/2), y+this.getHead().getHeight(), 1, 15));
		this.setHead(new Oval(x, y, this.getHead().getWidth(), this.getHead().getHeight()));
	}
	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
		super.setLocation(new Point(originX, originY));
		super.setBottom(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));
		this.setHead(new Oval(originX, originY, circleWidth, circleHeight));
	}

	public void changeLocationTo(int x, int y) {
		this.setHead(new Oval(x, y, this.getHead().getWidth(), this.getHead().getHeight()));
		this.setBottom(new Line(x, y, this.getBottom().getWidth(), this.getBottom().getHeight()));
	}
	public void changeLocationBy(int x, int y) {
		this.setHead(new Oval(x+this.getHead().getLocation().getX(), y+this.getHead().getLocation().getY(), this.getHead().getWidth(), this.getHead().getHeight()));
		this.setBottom(new Line(x+this.getBottom().getLocation().getX(), y+this.getBottom().getLocation().getY(), this.getBottom().getWidth(), this.getBottom().getHeight()));
	}
	public void setHead(IOval circle) {
		this.head = circle;
	}
	public IOval getHead() {
		return this.head;
	}
}
