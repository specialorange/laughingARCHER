package graphics;

import graphics.Point;

import java.beans.PropertyChangeListener;


public interface Line {
    public int getWidth();
    public int getHeight();
  public Point getLocation();
    public void setWidth(int newWidth);
    public void setHeight(int newHeight);
    public void setX(int newLocationX);
    public void setY(int newLocationY);
    public void addPropertyChangeListener(PropertyChangeListener newListener);
  public void animateSetWidth(int newWidth);
  public void animateSetHeight(int newHeight);
  public void animateSetHeight(int newHeight, int steps, int pauseTime);
  public void animateSetWidth(int newWidth, int steps, int pauseTime);
}