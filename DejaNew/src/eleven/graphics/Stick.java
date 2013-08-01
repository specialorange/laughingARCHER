package eleven.graphics;

import java.beans.PropertyChangeListener;
import util.annotations.Visible;
import eleven.Global;
import eleven.graphics.Line;

public abstract class Stick implements IStick {

	private IPoint location;
	private ILine bottom;
		
	public Stick(int x, int y, int width, int height){
		this.setLocation(new Point(x+width/2, y+height));
		this.setBottom(new Line(x, y, width, height));
	}
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {
		this.location = point;
	}
	public ILine getBottom() {
		return this.bottom;
	}
	public void setBottom(ILine bottom) {
		this.bottom = bottom;
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		Global.getListenerList().add(listener);
	}
}
