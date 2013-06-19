package recitation11.graphics.interfaces;

import recitation11.graphics.interfaces.Point;

public interface Line {
    public int getWidth();
    public int getHeight();
  public Point getLocation();
    public void setWidth(int newWidth);
    public void setHeight(int newHeight);
    public void setX(int newLocationX);
    public void setY(int newLocationY);
  //public void setLocation (Point newLocation);
}