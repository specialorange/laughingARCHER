package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Neighborhood extends Stack<IHome> implements INeighborhood {

	private IChild child;
	private boolean hasChildOnAWalkway;
//	private ArrayList<IListener> listenerList;
	private ArrayList<PropertyChangeListener> listenerList = new ArrayList<PropertyChangeListener>();
	
//	Using this one in Driver
	public Neighborhood() {
		setArrayList(new ArrayList<IHome>());
		this.listenerList = new ArrayList<PropertyChangeListener>();
		this.setChild(new Child(250,150,1,30,20,20, this.listenerList));
//	A Neighborhood has at least one house
		this.addHome(new Home(this.getArrayList().size()*350, this.listenerList));
	}

	public Neighborhood(ArrayList<PropertyChangeListener> listenerList) {
		setArrayList(new ArrayList<IHome>());
//		this.listenerList = listenerList;
		this.setChild(new Child(250,150,1,30,20,20, listenerList));
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < listenerList.size(); index++) {
			listenerList.get(index).propertyChange(event);
		}
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.listenerList.add(listener);
	}
	public void addHome(IHome home) {
		super.addItem(home);
		notifyAllListeners(new PropertyChangeEvent(this, "home", null, new Home(this.getArrayList().size()*350, this.listenerList)));
	}
	public void removeLastHome(IHome home) {
		super.removeLastItem();
		notifyAllListeners(new PropertyChangeEvent(this, "home", this.getArrayList().get(this.getArrayList().size()-1), null));
	}
	public boolean isChildInWalkwayOfHome(int number){
		return super.getArrayList().get(number).isChildTrespassing(this.child);
	}
//	@Visible(false)
//	TODO
//	Awaiting Response from Dewan
//	Same problem with not showing and it doesn't show the homes in the neighborhood
	
	
	public void moveChildBy(int x, int y) {
		child.changeLocationBy(x, y);
	}
	public void moveChildTo(int x, int y) {
		child.changeLocationTo(x, y);
	}
	public IChild getChild() {
		return this.child;
	}
	@Visible(false)
	public void setChild(IChild child) {
		this.child = child;
	}
	@Visible(false)
	public boolean getHasChildOnWalkway() {
		return this.hasChildOnAWalkway;
	}
	public void setHasChildOnWalkway(boolean value) {
		this.hasChildOnAWalkway = value;
	}
	public void fromHomeToChild(){};
	public void fromChildToHome(){};
}
