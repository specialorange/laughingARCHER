package nine.graphics;

public interface IHalloween {

	public void addHome();
	public void removeLastHome();
	public void moveChildTo(int x, int y);
	public void moveChildBy(int x, int y);
	public boolean isChildInWalkwayOfHouse(int number);
}
