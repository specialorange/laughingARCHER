package graphics;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;


public class ALine implements Line {
  
  Point location;
  int width, height;
  
  List<PropertyChangeListener> listeners;
  
  public ALine(int newWidth, int newHeight, Point newLocation) {
    width = newWidth;
    height = newHeight;
    location = newLocation;
    listeners = new Vector<PropertyChangeListener>();
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
    int oldVal=width;
    width = newWidth;
    notifyAllListeners(new PropertyChangeEvent(this, "width", oldVal, newWidth));
  }

  @Override
  public void setHeight(int newHeight) {
    int oldVal=height;
    height = newHeight;
    notifyAllListeners(new PropertyChangeEvent(this, "height", oldVal, newHeight));
  }

  public void setLocation(Point newLocation) {
    Point oldVal = location;
    location = newLocation;
    notifyAllListeners(new PropertyChangeEvent(this, "location", oldVal, newLocation));
  }

  @Override
  public void setX(int newLocationX) {
    setLocation(new APoint(newLocationX, location.getY()));
  }

  @Override
  public void setY(int newLocationY) {
    setLocation(new APoint(location.getX(), newLocationY));
  }
  
  private void notifyAllListeners(PropertyChangeEvent event){
      for(int i = 0; i < listeners.size(); i++)
          listeners.get(i).propertyChange(event);
  }
  
  public void addPropertyChangeListener(PropertyChangeListener newListener){
    listeners.add(newListener);
  }
  
  public void animateSetHeight(int newHeight){
    Runnable animateCommand = new ASetHeightCommand(this,newHeight,10,20); 
    Thread thread = new Thread(animateCommand);
    thread.setName("Height Animation");
    thread.start();
  }
  
  public void animateSetWidth(int newWidth){
    Runnable animateCommand = new ASetWidthCommand(this,newWidth,10,20); 
    Thread thread = new Thread(animateCommand);
    thread.setName("Width Animation");
    thread.start();
  }
  
  public synchronized void animateSetHeight(int newHeight, int steps, int pauseTime){
    int oldVal = this.getHeight();
    int newVal = newHeight;
    for (int x=1;x<=steps;x++){
      int currentValue=oldVal+(newVal-oldVal)*x/steps;
      this.setHeight(currentValue);
      sleep(pauseTime);
    }
  }
  
  public synchronized void animateSetWidth(int newWidth, int steps, int pauseTime){
    int oldVal = this.getWidth();
    int newVal = newWidth;
    for (int x=1;x<=steps;x++){
      int currentValue=oldVal+(newVal-oldVal)*x/steps;
      this.setWidth(currentValue);
      sleep(pauseTime);
    }
  }
  
  public void sleep(int pauseTime) {
    try {
      // OS suspends program for pauseTime
      Thread.sleep(pauseTime);
    } catch (InterruptedException e) {
      // program may be forcibly interrupted while sleeping
      e.printStackTrace();
    }
  }
}