package nine.graphics;

import java.util.ArrayList;

public interface IChild {
	public int getxDelta();
	public void setxDelta(int xDelta);
	public int getyDelta();
	public void setyDelta(int yDelta);
	public ICandyContainer getcC();
	public void setcC(ICandyContainer cC);
	public void checkIfInWalkway(ArrayList<Home> neighborhood);
	public void changeLocationBy(int x, int y);
	public void changeLocationTo(int x, int y);
	public IPoint getFeetLocation();
}
