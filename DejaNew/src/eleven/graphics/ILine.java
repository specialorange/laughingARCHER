package eleven.graphics;

public interface ILine {
	public IPoint getLocation();
	public IPoint getBottomLocation();
	public void setLocation(int x, int y);
 	public int getWidth();
	public void setWidth(int width);
	public int getHeight();
	public void setHeight(int height);
	public void changeLocationBy(int x, int y);
}	
