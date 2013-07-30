package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Line Pattern")
public class Line implements ILine{

	private IPoint location;
	private IPoint bottomLocation;
	private int width;
	private int height;
	private ArrayList<PropertyChangeListener> listenerList;
	
	public Line (int x, int y, int width, int height, ArrayList<PropertyChangeListener> listenerList) {
		this.setLocation(x, y);
		this.setWidth(width);
		this.setHeight(height);
		this.setBottomLocation(new Point(x, y+height));
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
	@Visible(false)
	public IPoint getBottomLocation() {
		return this.bottomLocation;
	}
	public void changeLocationBy(int x, int y) {
		this.location = new Point(x+ this.getLocation().getX(), y+this.getLocation().getY());
		IPoint oldLocation = this.getLocation();
		IPoint newLocation = new Point(x,y);
		notifyAllListeners(new PropertyChangeEvent(this, "location", oldLocation, newLocation));
	}
	public void changeLocationTo(int x, int y) {
		this.location = new Point(x, y);
		IPoint oldLocation = this.getLocation();
		IPoint newLocation = new Point(x,y);
		notifyAllListeners(new PropertyChangeEvent(this, "location", oldLocation, newLocation));
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(int x, int y) {
		this.location = new Point(x, y);
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	public void setBottomLocation(IPoint bottomLocation) {
		this.bottomLocation = bottomLocation;
	}
}
