package seven.graphics;

public class Home implements IHome {

	private IWalkway walkway;
	private IMailbox mailbox;
	private IHouseLabel house;
	private IAvatar avatar = new Avatar();
	
	public Home() {	
		this.setWalkway(new Walkway());
		this.setHouse(new HouseLabel());
		this.setMailbox(new Mailbox(200, 200, 0, 30, 20, 20));
		this.setAvatar(new Avatar(225, 225, 0, 30, 50, 50));
	}
	
	//may need to move the avatar from here, to reference it....
	public void moveAvatar() {
		this.getAvatar().changeLocation(15, -15);
//		this.getAvatar().changeBadXLocation(15, -15);
//		AvatarTester AT = new AvatarTester();
//		AT.test(this.getAvatar());
	}
	
	public IWalkway getWalkway() {
		return this.walkway;
	}
	public void setWalkway(Walkway walkway) {
		this.walkway = walkway;
	}
	public Home(String path) {	
		this.mailbox= new Mailbox(100, 100, 0, 30, 20, 20);
		this.house = new HouseLabel(path);
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
	public IAvatar getAvatar() {
		return this.avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
}
