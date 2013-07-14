package eleven.graphics;

public interface INeighborhood {

//	public void addItem();
	public void removeLastItem();
	public void moveChildTo(int x, int y);
	public void moveChildBy(int x, int y);
	public boolean isChildInWalkwayOfHome(int number);
	public void setHasChildOnWalkway(boolean value);
	
//	public IWalkway getWalkway();
//	public void setHasChildOnWalkway(boolean b);
//	public boolean isTresspassing(IChild child);
}
