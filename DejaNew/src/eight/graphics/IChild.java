package eight.graphics;

public interface IChild {
	public void changeLocationTo(int x, int y);
	public void changeLocationBy(int x, int y);
	public int getxDelta();
	public void setxDelta(int xDelta);
	public int getyDelta();
	public void setyDelta(int yDelta);
	public ICandyContainer getcC();
	public void setcC(ICandyContainer cC);
	public IAvatar getPerson();
	public void setPerson(IAvatar a);
//	public void moveLeft(int x);
//	public void moveRight(int x);
//	public void moveUp(int y);
//	public void moveDown(int y);
}
