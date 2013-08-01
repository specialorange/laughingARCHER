package eleven.graphics;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import eleven.Global;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Neighborhood extends Stack<IHome> implements INeighborhood {

	private IChild child;
	private boolean hasChildOnAWalkway;
	private boolean animate;
	
//	Using this one in Driver
	public Neighborhood() {
		setArrayList(new ArrayList<IHome>());
		this.setChild(new Child(250,150,1,30,20,20));
		Global.setListenerList(new ArrayList<PropertyChangeListener>());
		//	A Neighborhood has at least one house
		this.addHome();
	}

//Observers
//																			string, listener
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		Global.getListenerList().add(listener);
	}

	public void addHome() {
		super.addItem(new Home(this.getArrayList().size()*350));
	}
	public void removeLastHome() {
		super.removeLastItem();
	}
	public boolean isChildInWalkwayOfHome(int number){
		return super.getArrayList().get(number).isChildTrespassing(this.child);
	}

//	TODO
//	Awaiting Response from Dewan
//	Same problem with not showing and it doesn't show the homes in the neighborhood	
	public void moveChildBy(int x, int y) {
		child.changeLocationBy(x, y, isAnimate());
	}
	public void moveChildTo(int x, int y) {
		child.changeLocationTo(x, y, isAnimate());
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
		this.hasChildOnAWalkway = value;
	}
	public boolean isAnimate() {
		return this.animate;
	}
	public void setAnimate(boolean animate) {
		this.animate = animate;
	}
}
