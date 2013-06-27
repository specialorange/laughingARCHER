package nine.graphics;

public interface IWalkway {
	public IPoint getLocation();
	public void setLocation(IPoint point);
	public int getWidth();
	public int getHeight();
	public IPoint getUpperLeft();
	public IPoint getUpperRight();
	public IPoint getLowerLeft();
	public IPoint getLowerRight();
}
