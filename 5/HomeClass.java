package ass5;
import ass5.HouseClass;
import ass5.MailboxClass;

public class HomeClass implements HomeInterface {

	private MailboxClass mailbox;
	private HouseClass house;
	
	public HomeClass() {	
		this.mailbox= new MailboxClass(100, 100, 0, 30, 20, 20);
		this.house = new HouseClass();
	}

	public MailboxClass getMailbox() {
		return this.mailbox;
	}
	public void setMailbox(MailboxClass mailbox) {
		this.mailbox = mailbox;
	}
	public HouseClass getHouse() {
		return this.house;
	}
	public void setHouse(HouseClass house) {
		this.house = house;
	}
}
