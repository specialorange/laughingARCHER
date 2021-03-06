package ten.graphics;

import java.util.ArrayList;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Child extends Avatar implements IChild{

	private int xDelta = 30;
	private int yDelta = -35;
	private ICandyContainer cC;
	private IPoint location;
	private int houseConnectedTo;
	private boolean connected;
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80, 0);
	}
	
	public Child(int originX, int originY, int bodyWidth, int bodyHeight, int headWidth, int headHeight) {
		this.setLocation(new Point(originX, originY));
		this.setcC(new CandyContainer(originX+xDelta, originY+yDelta, 12, 51, 0));
	}

	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	@Visible(false)
	public int getxDelta() {
		return this.xDelta;
	}
	@Visible(false)
	public int getyDelta() {
		return this.yDelta;
	}
	public void checkIfInWalkwayOfAllHomes(ArrayList<IHome> neighborhood) {
		for (int i=0 ; i < neighborhood.size() ; i++ ) {
//			TODO same problem as in the Neighborhood Class
//			The get(n) should return the Home form the list of the neighborhood
			IPoint upperLeftBBoxWalkway = neighborhood.get(i).getWalkway().getUpperLeft();
			IPoint upperRightBBoxWalkway = neighborhood.get(i).getWalkway().getUpperRight();
			IPoint bottomLeftBBoxWalkway = neighborhood.get(i).getWalkway().getLowerLeft();
//			IPoint bottomRightBBoxWalkway = neighborhood.get(i).getWalkway().getLowerRight();
			int childFootX = getFeetLocation().getX();
			int childFootY = getFeetLocation().getY();
			if ( (childFootX <= upperRightBBoxWalkway.getX() && childFootX >= upperLeftBBoxWalkway.getX()) && 
				 (childFootY <= bottomLeftBBoxWalkway.getY() && childFootY >= upperLeftBBoxWalkway.getY())
					) {
//				Todo why do I have to cast this as a neighborhood? it know it is a INeghborhood form the parameter?
				((INeighborhood) neighborhood).setHasChildOnWalkway(true);
				System.out.println("Child in Home " + i + " Walkway true");
			} else {
				((INeighborhood) neighborhood).setHasChildOnWalkway(false);
				System.out.println("Child in Walkway false");
				break;
			}
		}
	}
	public void setLocation(Point point) {
		this.location = point;
	}
	public void setxDelta(int xDelta) {
		this.xDelta = xDelta;
	}
	public void setyDelta(int yDelta) {
		this.yDelta = yDelta;
	}
	public ICandyContainer getcC() {
		return this.cC;
	}
	public void setcC(ICandyContainer cC) {
		this.cC = cC;
	}
	public void connectToHome(int index) {
		this.setHouseConnectedTo(index);
		this.connect();
	}
	public void disconnectFromHome() {
		this.setHouseConnectedTo((Integer) null);
		this.disconnect();
	}
	public int getHouseConnectedTo() {
		return this.houseConnectedTo;
	}
	public void setHouseConnectedTo(int houseConnectedTo) {
		this.houseConnectedTo = houseConnectedTo;
	}
	public boolean getConnectionStatus() {
		return this.connected;
	}
	public void connect() {
		this.connected = true;
	}
	public void disconnect() {
		this.connected = false;
	}
	public void take(int numberOfCandies) {
		this.getcC().getCandyList().addItem();
	}
	public void give(int numberOfCandies) {
		this.getcC().getCandyList().removeLastItem();
	}
}
