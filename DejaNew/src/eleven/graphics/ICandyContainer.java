package eleven.graphics;

public interface ICandyContainer {
	public IPoint getLocation();
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
	public int getWidth();
	public int getHeight();
	public ICandyList getCandyList();
}
