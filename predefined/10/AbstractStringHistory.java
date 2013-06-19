package stringhistory;

import java.util.List;

public abstract class AbstractStringHistory implements StringHistory{
  
  private List history;

  public AbstractStringHistory(){
    history = createInitialList();
  }
  
  public abstract List createInitialList();

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