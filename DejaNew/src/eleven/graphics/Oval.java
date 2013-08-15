package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import eleven.Global;

import util.annotations.StructurePattern;

@StructurePattern("Oval Pattern")
public class Oval implements IOval {
	private int width;
	private int height;
	private IPoint location;
	
	public Oval(int x, int y, int width, int height) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		Global.getListenerList().add(listener);
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < Global.getListenerList().size(); index++) {
			Global.getListenerList().get(index).propertyChange(event);
		}
	}
	public void changeLocationBy(int x, int y) {
		IPoint oldLocation = this.location;
		this.location = new Point(this.getLocation().getX()+x,this.getLocation().getY()+y);
		IPoint newLocation = this.location;
		notifyAllListeners(new PropertyChangeEvent(this, "location", oldLocation, newLocation));
	}
	public void changeLocationTo(int x, int y) {
		IPoint oldLocation = this.location;
		this.location = new Point(x,y);
		IPoint newLocation = this.location;
		notifyAllListeners(new PropertyChangeEvent(this, "location", oldLocation, newLocation));
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint location) {
		this.location = location;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
}
