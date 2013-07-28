package eleven.graphics;

public interface IPoint {
	public int getX(); 
	public int getY();
	public void changeLocationBy(int x, int y);
	public void changeLocationTo(int x, int y);
}
