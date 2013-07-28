package eleven.graphics;

public interface IOval {
	public IPoint getLocation();
	public void setLocation(IPoint point);
	public void changeLocationBy(int x, int y);
	public void changeLocationTo(int x, int y);
	public int getWidth();
	public int getHeight();
}
