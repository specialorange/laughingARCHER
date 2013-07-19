package eleven;

import eleven.graphics.IHome;
import eleven.graphics.IChild;


public interface IPointController{
	public void setHome(IHome home);
	public void setChild(IChild child);
	public void processMovement();
}
