package eleven.graphics;

public interface IStick {
	public IPoint getLocation();
	public void setLocation(IPoint point);
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
	public ILine getBottom();
	public void setBottom(ILine bottom);
}
