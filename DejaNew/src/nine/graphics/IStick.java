package nine.graphics;

import java.util.ArrayList;

public interface IStick {
	public IPoint getLocation(); 
	public void setLocation(IPoint point);
	public int getWidth();
	public void setWidth(int newVal);
	public int getHeight() ;
	public void setHeight(int newVal);
	public ILine getBottom();
	public void setBottom(ILine bottom);
	public IPoint getFeetLocation();
}
