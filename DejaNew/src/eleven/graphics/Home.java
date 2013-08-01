package eleven.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import eleven.Global;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Home extends Stack<Home> implements IHome {

	private IPoint location;
	private IWalkway walkway;
	private IMailbox mailbox;
	private IHouseLabel house;
	private ICandyContainer cC;
	private boolean hasChildOnWalkway;

	public Home(int x) {	
		this.setLocation(new Point(x,0));
		this.setWalkway(new Walkway(x+87,205,30,75));
		this.setHouse(new HouseLabel(x,0));
		this.setMailbox(new Mailbox(x+25, 250, 0, 20, 10, 10));
		this.setcC(new CandyContainer(x+95, 145, 15, 51, 3));
	}
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < Global.getListenerList().size(); index++) {
			Global.getListenerList().get(index).propertyChange(event);
		}
	}
// Observers
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		Global.getListenerList().add(listener);
	}

	public ArrayList<Home> getArrayList() {
		return super.getArrayList();
	}
	public IWalkway getWalkway() {
		return this.walkway;
	}
	public void setWalkway(Walkway walkway) {
		this.walkway = walkway;
	}
	public IMailbox getMailbox() {
		return this.mailbox;
	}
	public void setMailbox(Mailbox mailbox) {
		this.mailbox = mailbox;
	}
	public IHouseLabel getHouse() {
		return this.house;
	}
	public void setHouse(HouseLabel house) {
		this.house = house;
	}
	public ICandyContainer getcC() {
		return cC;
	}
	public void setcC(ICandyContainer cC) {
		this.cC = cC;
	}
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint location) {
		this.location = location;
	}
	@Visible(false)
	public boolean isHasChildOnWalkway() {
		return this.hasChildOnWalkway;
	}
	@Visible(false)
	public boolean isChildTrespassing(IChild child) {
		IPoint upperLeftBBoxWalkway = this.getWalkway().getUpperLeft();
		IPoint upperRightBBoxWalkway = this.getWalkway().getUpperRight();
		IPoint bottomLeftBBoxWalkway = this.getWalkway().getLowerLeft();
//		IPoint bottomRightBBoxWalkway = this.getWalkway().getLowerRight();
		int childFootX = child.getLocation().getX();
		int childFootY = child.getLocation().getY();
		if ( (childFootX <= upperRightBBoxWalkway.getX() && childFootX >= upperLeftBBoxWalkway.getX()) && 
			 (childFootY <= bottomLeftBBoxWalkway.getY() && childFootY >= upperLeftBBoxWalkway.getY())
				) {
			setHasChildOnWalkway(true);
			child.connect();
			System.out.println("Child in this home's Walkway: true");
		} else {
			setHasChildOnWalkway(false);
			child.disconnect();
			System.out.println("Child not in Walkway");
		}
		return this.getHasChildOnWalkway();
	}
	public void setHasChildOnWalkway(boolean hasChildOnWalkway) {
		this.hasChildOnWalkway = hasChildOnWalkway;
	}
	public boolean getHasChildOnWalkway() {
		return this.hasChildOnWalkway;
	}
	public void take(int numberOfCandies) {
		this.getcC().getCandyList().addItem();
	}
	public void give(int numberOfCandies) {
		this.getcC().getCandyList().removeLastItem();
	}
}
