package graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;


public class ALineEditor implements LineEditor,PropertyChangeListener {

  Line line;
  List<PropertyChangeListener> listeners;
  
  public ALineEditor(Line l) {
    line = l;
    line.addPropertyChangeListener(this);
    listeners = new Vector<PropertyChangeListener>();
  }
  public int getLineWidth() {
    return line.getWidth();
  }

  public void setLineWidth(int newWidth) {
    line.animateSetWidth(newWidth);
  }
  @Override
  public int getLineHeight() {
    return line.getHeight();
  }
  @Override
  public void setLineHeight(int newHeight) {
    line.animateSetHeight(newHeight);
  }
  @Override
  public int getLineXValue() {
    return line.getLocation().getX();
  }
  @Override
  public void setLineXValue(int newLineX) {
    line.setX(newLineX);
  }
  @Override
  public int getLineYValue() {
    return line.getLocation().getY();
  }
  @Override
  public void setLineYValue(int newLineY) {
    line.setY(newLineY);
  }
  
  @Override
  public void propertyChange(PropertyChangeEvent event) {
    if (event.getPropertyName().equalsIgnoreCase("width"))
      notifyAllListeners(new PropertyChangeEvent(this,"LineWidth",event.getOldValue(),event.getNewValue()));
    else if (event.getPropertyName().equalsIgnoreCase("height"))
      notifyAllListeners(new PropertyChangeEvent(this,"LineHeight",event.getOldValue(),event.getNewValue()));
  }
  
  private void notifyAllListeners(PropertyChangeEvent event){
      for(int i = 0; i < listeners.size(); i++)
          listeners.get(i).propertyChange(event);
  }
  
  public void addPropertyChangeListener(PropertyChangeListener newListener){
    listeners.add(newListener);
  }
  
}