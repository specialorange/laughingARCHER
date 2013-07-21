package eleven;

import eleven.graphics.IChild;
import eleven.graphics.IHome;
import eleven.graphics.IPoint;

public class PointController implements IPointController{
	IHome home;
	IChild child;
	IListener listener;
	IPoint finalDestination;
	
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
		int wWULX = home.getWalkway().getUpperLeft().getX();
		int wWULY = home.getWalkway().getUpperLeft().getY();		
		int wWURX = home.getWalkway().getUpperRight().getX();
		int wWLLY = home.getWalkway().getLowerLeft() .getY();
		int cX = child.getLocation().getX();
		int cY = child.getLocation().getY();
//  UL----UR
//	|     |
//	|     |
//	LL----LR
		
		int xMoved = 0;
		int YMoved = 0;
		
//		until we get to the final destination....
		while ( child.getLocation().getX() != finalDestination.getX() && child.getLocation().getY() != finalDestination.getY() ) {
			// Move in right angles
			int moveX = 0;
			int moveY = 0;
			if( finalDestination.getX() > child.getLocation().getX() ) {
				moveX = 1;
			} else if (finalDestination.getX() < child.getLocation().getX() ) {
				moveX = -1;
			}
			if( finalDestination.getY() > child.getLocation().getY() ) {
				moveY = 1;
			} else if (finalDestination.getY() < child.getLocation().getY() ) {
				moveY = -1;
			}
//		Move the child
			child.changeLocationBy(moveX, moveY);
			xMoved ++;
			YMoved ++;
			
//		If we are in the walkway
			if ( !(cX >= wWULX && cX <= wWURX) || !(cY >= wWULY && cY <= wWLLY) ) {
				// set detached
				child.disconnect();
			} else {
				// set attached...
//			HOW To pass the index of the home the child is connecting to
//				child.connectToHome(neighborhood._indexof(home));
			}
		}
	}
}
