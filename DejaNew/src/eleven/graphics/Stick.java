package eleven.graphics;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import util.annotations.Visible;
import eleven.graphics.Line;

public abstract class Stick implements IStick {

	private IPoint location;
	private ILine bottom;
	private ArrayList<PropertyChangeListener> listenerList;
		
	public Stick(int x, int y, ArrayList<PropertyChangeListener> listenerList){
		this.setLocation(new Point(15, 30));
		this.setBottom(new Line(x, y, 0, 30, listenerList));		
		this.setListenerList(listenerList);
	}
	
	public Stick(int x, int y, int width, int height, ArrayList<PropertyChangeListener> listenerList){
		this.setLocation(new Point(width/2, y));
		this.setBottom(new Line(x, y, width, height, listenerList));
		this.setListenerList(listenerList);
	}
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public ILine getBottom() {
		return this.bottom;
	}
	public void setBottom(ILine bottom) {
		this.bottom = bottom;
	}

	public ArrayList<PropertyChangeListener> getListenerList() {
		return listenerList;
	}

	public void setListenerList(ArrayList<PropertyChangeListener> listenerList) {
		this.listenerList = listenerList;
	}
}
