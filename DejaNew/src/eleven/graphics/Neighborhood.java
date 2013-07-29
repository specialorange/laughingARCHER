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
	private ArrayList<PropertyChangeListener> listenerList;
	
//	Using this one in Driver
	public Neighborhood() {
		setArrayList(new ArrayList<IHome>());
		this.listenerList = new ArrayList<PropertyChangeListener>();
		this.setChild(new Child(250,150,1,30,20,20, this.listenerList));
//	A Neighborhood has at least one house
		this.addHome();
	}

	public Neighborhood(ArrayList<PropertyChangeListener> listenerList) {
		setArrayList(new ArrayList<IHome>());
		this.listenerList = listenerList;
		this.setChild(new Child(250,150,1,30,20,20, listenerList));
	}
//Observers
//																			string, listener
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.listenerList.add(listener);
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < listenerList.size(); index++) {
			listenerList.get(index).propertyChange(event);
		}
	}

	public void addHome() {
		super.addItem(new Home(this.getArrayList().size()*350, this.listenerList));
		IHome newHome = new Home(this.getArrayList().size()*350, this.listenerList);
		notifyAllListeners(new PropertyChangeEvent(this, "homeList", null, newHome));
	}
	public void removeLastHome() {
		super.removeLastItem();
		IHome oldHome = this.getArrayList().get(this.getArrayList().size()-1);
		notifyAllListeners(new PropertyChangeEvent(this, "home", oldHome, null));
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
	public void setChild(IChild child) {
		this.child = child;
	}
	@Visible(false)
	public boolean getHasChildOnWalkway() {
		return this.hasChildOnAWalkway;
	}
	public void setHasChildOnWalkway(boolean value) {
		boolean oldVal = this.getHasChildOnWalkway();
		boolean newVal = value;
		this.hasChildOnAWalkway = value;
		notifyAllListeners(new PropertyChangeEvent(this, "hasChildOnWalkway", oldVal, newVal));
	}
	public void fromHomeToChild(){};
	public void fromChildToHome(){};
}
