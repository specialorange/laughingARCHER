package eight.graphics;

public interface IAvatar {
	public IOval getHead();
	public void setHead(IOval circle);
	public ILine getBody();
	public void setBody(ILine post);
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
	public void setLocation(Point point);
}
