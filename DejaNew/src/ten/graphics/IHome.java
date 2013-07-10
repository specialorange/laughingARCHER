package ten.graphics;

public interface IHome {
	public IMailbox getMailbox();
	public IHouseLabel getHouse();
	public boolean isChildTrespassing(IChild child);
}
