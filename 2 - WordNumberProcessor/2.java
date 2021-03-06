package main;

public class wordNumberProcessor {

  public static void main(String[] cheese) {
    if (cheese.length == 1) {
        tokensInArray(cheese);
      } else {
        System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
      }
  }

  public static void tokensInArray (String[] args) {
    boolean inAToken = false;
    int startMarker = 0;
    String tokenType = new String();
    for ( int index = 0; index < args[0].length(); index++ ) {
      char tokenChar = args[0].charAt(index);
      if (Character.isDigit(tokenChar)) {
      if (!inAToken) { 
        startMarker = index;
        tokenType = "Number: ";
        inAToken = true;    
      }
      } else if (Character.isLetter(tokenChar)) {
      if (!inAToken) { 
        startMarker = index;
        tokenType = "Word: ";
        inAToken = true;          
      }       
      } else { //blank
      if (inAToken) { 
        System.out.println(tokenType + args[0].substring(startMarker, index));
        inAToken = false;
        tokenType = "";
      }
      }
    }
  }
}
