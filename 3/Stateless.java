package ass3;

public class State {

  public static void main(String[] cheese) {
    if (cheese.length == 1) {
        tokensInArray(cheese[0]);
      } else {
        System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
      }
  }

  public static String tokensInArray (String cheese) {
    String concatenation = new String();
    boolean inAToken = false;
    int startMarker = 0;
    String tokenType = new String();
    for ( int index = 0; index < cheese.length(); index++ ) {
      char tokenChar = cheese.charAt(index);
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
          concatenation += " " + tokenType + cheese.substring(startMarker, index);
          inAToken = false;
          tokenType = "";
        }
      }
    }
    System.out.println(concatenation);
    return concatenation;
  }
}
