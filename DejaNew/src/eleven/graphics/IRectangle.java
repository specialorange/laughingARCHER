package eleven.graphics;

public interface IRectangle {
	public IPoint getLocation();
	public void setLocation(IPoint point);
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
	public int getWidth();
	public int getHeight();
}
