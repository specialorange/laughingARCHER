package main;

public class wordNumberProcessor {

  /**
   * @param args
   */
  public static void main(String[] cheese) {
      if (cheese.length == 1) {
      tokensInArray(cheese);
      } else {
        System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
      }
  }

  public static void tokensInArray (String[] args) {
    Boolean inAToken = false;
    int endMarker = 0;
    for ( int index = 0; index < args[0].length; i++ ) {
      char tokenChar = args[0].charAt(index);
      System.out.println(tokenChar);
    }
  }

}
