package eleven;

import eleven.graphics.IChild;
import eleven.graphics.IPoint;

public interface IListener {
	public void update (Observed observed);
	public void updateLocation(IChild child, IPoint oldLocation, IPoint newLocation);
}
