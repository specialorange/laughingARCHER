package eight.graphics;

public interface IAvatar {
	public IOval getHead();
	public void setHead(IOval circle);
	public ILine getBody();
	public void setBody(ILine post);
	public void changeLocation(int x, int y);
}
