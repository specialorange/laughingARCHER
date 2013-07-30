package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class CandyContainer implements ICandyContainer {

	private IPoint 	location;
	private ILine 	left, right, bottom;
	private int 	width, height;
	private ICandyList candyList;
	private ArrayList<PropertyChangeListener> listenerList;

	public CandyContainer(int x, int y, int width, int height, int defaultCandyCount, ArrayList<PropertyChangeListener> listenerList) {
		this.setLocation(new Point(x, y));
		this.setLeft(new Line(x, y, 0, height, listenerList));
		this.setRight(new Line(x+width, y, 0, height, listenerList));
		this.setBottom(new Line(x, y+height, width, 0, listenerList));
		this.setCandyList(new CandyList(width, height, this.getLocation(), defaultCandyCount));
		this.setListenerList(listenerList);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.listenerList.add(listener);
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < this.listenerList.size(); index++) {
			this.listenerList.get(index).propertyChange(event);
		}
	}

	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	@Visible(false)
	public int getWidth() {
		return this.width;
	}
	@Visible(false)
	public int getHeight() {
		return this.height;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public void changeLocationTo(int x, int y) {
		this.setLocation(new Point(x,y));
		this.candyList.changeLocationTo(x, y);
	}
	public void changeLocationBy(int x, int y) {
		this.setLocation(new Point(x + this.getLocation().getX(), y + this.getLocation().getY()));
		this.left.changeLocationBy(x, y);
		this.right.changeLocationBy(x, y);
		this.bottom.changeLocationBy(x, y);
		this.candyList.changeLocationBy(x,y);
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public ILine getLeft() {
		return this.left;
	}
	public void setLeft(Line left) {
		this.left = left;
	}
	public ILine getRight() {
		return this.right;
	}
	public void setRight(Line right) {
		this.right = right;
	}
	public ILine getBottom() {
		return bottom;
	}
	public void setBottom(Line bottom) {
		this.bottom = bottom;
	}
//	TODO
//	@Visible(false)
//	AWAITING REPSONSE FROM Dewan
//	If I put `@Visible(false)` here, it removes the empty text declarations in Object editor, but it also removes the Candies in the CandyList
	public ICandyList getCandyList() {
		return this.candyList;
	}
	public void setCandyList(ICandyList candyList) {
		this.candyList = candyList;
	}

	public ArrayList<PropertyChangeListener> getListenerList() {
		return listenerList;
	}

	public void setListenerList(ArrayList<PropertyChangeListener> listenerList) {
		this.listenerList = listenerList;
	}
}
