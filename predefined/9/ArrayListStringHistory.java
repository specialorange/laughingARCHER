package stringhistory;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStringHistory implements StringHistory{
  
  private List history;

  public ArrayListStringHistory(){
    history = new ArrayList();
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