package nine.graphics;

import java.util.ArrayList;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Child implements IChild{

	private int xDelta = 30;
	private int yDelta = -35;
	private ICandyContainer cC;
	private IAvatar person;
	private IPoint location;
	
	public Child(int x, int y) {
		this.setLocation(new Point(x,y));
		person = new Avatar();
		cC = new CandyContainer(x+xDelta, y+yDelta, 25, 80, 0);
	}
	
	public Child(int originX, int originY, int bodyWidth, int bodyHeight, int headWidth, int headHeight) {
		this.setLocation(new Point(originX, originY));
		this.setPerson(new Avatar(originX, originY, bodyWidth, bodyHeight, headWidth, headHeight));
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
	@Visible(false)
	public IPoint getFeetLocation() {
		return this.person.getBody().getBottomLocation();
	}

	public void checkIfInWalkway(ArrayList<Home> neighborhood) {
		System.out.println("Checking!");
		for (int i=0 ; i < neighborhood.size() ; i++ ) {
			IPoint upperLeftBBoxWalkway = neighborhood.get(i).getWalkway().getUpperLeft();
			IPoint upperRightBBoxWalkway = neighborhood.get(i).getWalkway().getUpperRight();
			IPoint bottomLeftBBoxWalkway = neighborhood.get(i).getWalkway().getLowerLeft();
			IPoint bottomRightBBoxWalkway = neighborhood.get(i).getWalkway().getLowerRight();
			int childFootX = getFeetLocation().getX();
			int childFootY = getFeetLocation().getY();
			if ( (childFootX <= upperRightBBoxWalkway.getX() && childFootX >= upperLeftBBoxWalkway.getX()) && 
				 (childFootY <= bottomLeftBBoxWalkway.getY() && childFootY >= upperLeftBBoxWalkway.getY())
					) {
				neighborhood.get(i).setHasChildOnWalkway(true);
				System.out.println("Child in Home " + i + " Walkway true");
			} else {
				neighborhood.get(i).setHasChildOnWalkway(false);
				System.out.println("Child in Walkway false");
				break;
			}
		}
	}
	public void changeLocationTo(int x, int y){
		this.person.setLocation(new Point(x,y));
		this.person.changeLocationTo(x, y);
		this.cC.changeLocationTo(x, y);
	}
	public void changeLocationBy(int x, int y){
		this.setLocation(new Point(x,y));
		this.person.changeLocationBy(x, y);
		this.cC.changeLocationBy(x, y);
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
	public IAvatar getPerson() {
		return this.person;
	}
	public void setPerson(IAvatar a) {
		this.person = a;
	}
}
