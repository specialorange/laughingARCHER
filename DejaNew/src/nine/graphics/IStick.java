package nine.graphics;

import java.util.ArrayList;

public interface IStick {
	public IPoint getLocation(); 
	public void setLocation(IPoint point);
	public ILine getBottom();
	public void setBottom(ILine bottom);
	public IPoint getFeetLocation();
}
