package ass5;
import ass5.Label;
import ass5.Mailbox;

public class Home implements IHome {

	private Mailbox mailbox;
	private Label house;
	private Avatar avatar;
	
	public Home() {	
		this.setHouse(new Label());
		this.setMailbox(new Mailbox(200, 200, 0, 30, 20, 20));
		this.setAvatar(new Avatar(225, 225, 0, 30, 50, 50));
	}
	
	public Home(String path) {	
		this.mailbox= new Mailbox(100, 100, 0, 30, 20, 20);
		this.house = new Label(path);
	}

	public Mailbox getMailbox() {
		return this.mailbox;
	}
	public void setMailbox(Mailbox mailbox) {
		this.mailbox = mailbox;
	}
	public Label getHouse() {
		return this.house;
	}
	public void setHouse(Label house) {
		this.house = house;
	}
	public Avatar getAvatar() {
		return this.avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
}
