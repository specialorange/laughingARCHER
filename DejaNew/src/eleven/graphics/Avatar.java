package eleven.graphics;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class Avatar extends Stick implements IAvatar{

	private IOval head;
	
//	public Avatar() {
//		super.setLocation(new Point(115, 130));
//		super.setBottom(new Line(110, 120, 1, 30));
//		this.setHead(new Oval());
//	}
//	public Avatar(int x, int y) {
//		super.setLocation(new Point(x, y));
//		super.setBottom(new Line(x, y-this.getHead().getHeight(), this.getBottom().getWidth(), this.getBottom().getHeight()));
//		this.setHead(new Oval(x-this.getHead().getWidth()/2, y-this.getBottom().getHeight()-this.getHead().getHeight(), this.getHead().getWidth(), this.getHead().getHeight()));
//	}
	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight, ArrayList<PropertyChangeListener> listenerList) {
		super.setLocation(new Point(originX, originY));
		super.setBottom(new Line(originX, originY-postHeight, postWidth, postHeight));
		this.setHead(new Oval(originX-circleHeight/2, originY-postHeight-circleHeight, circleWidth, circleHeight));
	}
	public void changeLocationTo(int x, int y) {
		this.getLocation().changeLocationTo(x, y);
		this.getHead().changeLocationTo(x, y);
		this.getBottom().changeLocationTo(x, y);		
//		for each PCL.update(this);
	}
	public void changeLocationBy(int x, int y) {
		this.getLocation().changeLocationBy(x, y);
		this.getHead().changeLocationBy(x, y);
		this.getBottom().changeLocationBy(x, y);
	}
	public void setHead(IOval circle) {
		this.head = circle;
	}
	public IOval getHead() {
		return this.head;
	}
}
