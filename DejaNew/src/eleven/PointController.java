package eleven;

import eleven.graphics.IChild;
import eleven.graphics.IHome;

public class PointController implements IPointController{
	IHome home;
	IChild child;
	IListener listener;
	
	public void setListener(IListener listener) {
		this.listener = listener;
	}
	public void setHome(IHome home) {
		this.home = home;
	}
	public void setChild(IChild child) {
		this.child = child;
	}
	public void processMovement() {
		while ( child.getFeetLocation().getX() != home.getLocation().getX() && child.getFeetLocation().getY() != home.getLocation().getY() ) {
	// set detached
			//update the location?

		}
//		set attached...
	}
}
