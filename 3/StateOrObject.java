package ass3;

import ass3.Stateless;
import ass3.Object;

public class StateOrObject {
  public static void main(String[] cheese) {
    if (cheese.length == 1) {
      ass3.State.main(cheese[0]);  //run the main method in State class
      ass3.Object.main(cheese[0]); //run the main method in Object class
    } else {
      System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
    }
  }
  
}
