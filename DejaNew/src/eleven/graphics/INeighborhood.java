package eleven.graphics;

import java.beans.PropertyChangeListener;

public interface INeighborhood {
	public void removeLastItem();
	public void moveChildTo(int x, int y);
	public void moveChildBy(int x, int y);
	public boolean isChildInWalkwayOfHome(int number);
	public void setHasChildOnWalkway(boolean value);
	public void addHome();
	public void removeLastHome();
	public void addPropertyChangeListener(PropertyChangeListener listener);	
	public void setAnimate(boolean animate);
	public boolean isAnimate();
}
