package stringhistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorStringHistory extends AbstractStringHistory{

  public List createInitialList(){
    return new Vector();
  }

}