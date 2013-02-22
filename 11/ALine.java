package recitation11.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;

import recitation11.graphics.interfaces.Line;
import recitation11.graphics.interfaces.Point;

public class ALine implements Line {
  Point location;
  int width, height;
    
  public ALine(int newWidth, int newHeight, Point newLocation) {
    width = newWidth;
    height = newHeight;
    location = newLocation;
  }
  
  @Override
  public Point getLocation() {
    return location;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }

  @Override
  public void setWidth(int newWidth) {
    width = newWidth;
  }

  @Override
  public void setHeight(int newHeight) {
    height = newHeight;
  }

  public void setLocation(Point newLocation) {
    location = newLocation;
  }

  @Override
  public void setX(int newLocationX) {
    setLocation(new APoint(newLocationX, location.getY()));
  }

  @Override
  public void setY(int newLocationY) {
    setLocation(new APoint(location.getX(), newLocationY));
  }
}