package stringhistory;

import java.util.List;
import java.util.Vector;

public class VectorStringHistory implements StringHistory{

  private List history;

  public VectorStringHistory(){
    history = new Vector();
  }

  public void addElement(String element) {
    history.add(element);
  }

  public String elementAt(int index) {
    return (String)history.get(index);
  }

  public int size() {
    return history.size();
  }

}