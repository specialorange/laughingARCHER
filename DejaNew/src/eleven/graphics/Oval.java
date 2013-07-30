package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import util.annotations.StructurePattern;

@StructurePattern("Oval Pattern")
public class Oval implements IOval {
	private int width;
	private int height;
	private IPoint location;
	private ArrayList<PropertyChangeListener> listenerList;
	
	public Oval(int x, int y, int width, int height, ArrayList<PropertyChangeListener> listenerList) {
		this.setLocation(new Point(x,y));
		this.setWidth(width);
		this.setHeight(height);
		this.setListenerList(listenerList);
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < this.listenerList.size(); index++) {
			this.listenerList.get(index).propertyChange(event);
		}
	}
	public ArrayList<PropertyChangeListener> getListenerList() {
		return listenerList;
	}
	public void setListenerList(ArrayList<PropertyChangeListener> listenerList) {
		this.listenerList = listenerList;
	}
	public void changeLocationBy(int x, int y) {
		this.location = new Point(this.getLocation().getX()+x,this.getLocation().getY()+y);
		IPoint oldLocation = this.getLocation();
		IPoint newLocation = new Point(x,y);
		notifyAllListeners(new PropertyChangeEvent(this, "location", oldLocation, newLocation));
	}
	public void changeLocationTo(int x, int y) {
		this.location = new Point(x,y);
		IPoint oldLocation = this.getLocation();
		IPoint newLocation = new Point(x,y);
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
