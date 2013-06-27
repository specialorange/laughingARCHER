package nine.graphics;

import util.annotations.Visible;

public class Home implements IHome {

	private IPoint location;
	private IWalkway walkway;
	private IMailbox mailbox;
	private IHouseLabel house;
	private ICandyContainer cC;
	private boolean hasChildOnWalkway;
	
	public Home() {	
		this.setLocation(new Point(0,0));
		this.setWalkway(new Walkway(87,205,30,75));
		this.setHouse(new HouseLabel(0,0));
		this.setMailbox(new Mailbox(25, 250, 0, 20, 10, 10));
		this.setcC(new CandyContainer(95, 145, 15, 51, 3));
	}
	public Home(int x) {	
		this.setLocation(new Point(x,0));
		this.setWalkway(new Walkway(x+87,205,30,75));
		this.setHouse(new HouseLabel(x,0));
		this.setMailbox(new Mailbox(x+25, 250, 0, 20, 10, 10));
		this.setcC(new CandyContainer(x+95, 145, 15, 51, 3));
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
	public boolean isHasChildOnWalkway() {
		return this.hasChildOnWalkway;
	}
	public void setHasChildOnWalkway(boolean hasChildOnWalkway) {
		this.hasChildOnWalkway = hasChildOnWalkway;
	}
}
