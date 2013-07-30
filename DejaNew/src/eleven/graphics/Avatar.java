package eleven.graphics;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class Avatar extends Stick implements IAvatar{

	private IOval head;

	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight, ArrayList<PropertyChangeListener> listenerList) {
		super(originX, originY, circleWidth, circleHeight+postHeight, listenerList);
		this.setHead(new Oval(originX-circleHeight/2, originY-postHeight-circleHeight, circleWidth, circleHeight, listenerList));
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.getListenerList().add(listener);
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
