package nine.graphics;

public interface IAvatar {
	public IOval getHead();
	public void setHead(IOval circle);
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
}
