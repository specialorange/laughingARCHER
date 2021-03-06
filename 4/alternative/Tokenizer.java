package ass4;

import ass4.NumberToken;
import ass4.WordToken;

public class Tokenizer {
  public static TokenInterface tokensInArray (String cheese) {
    boolean inAToken = false;
    int startMarker = 0;
    String tokenType = new String();
    for ( int index = 0; index < cheese.length(); index++ ) {
      char tokenChar = cheese.charAt(index);
      if (Character.isDigit(tokenChar)) {
        if (!inAToken) {
          startMarker = index;
          tokenType = "Number";
          inAToken = true;
        }
      } else if (Character.isLetter(tokenChar)) {
        if (!inAToken) { 
          startMarker = index;
          tokenType = "Word";
          inAToken = true;          
        }       
      } else { //blank
        if (inAToken) { 
          if (tokenType == "Word") {
            WordToken token = new WordToken(cheese.substring(startMarker, index));
            inAToken = false;
            tokenType = "";
            return token;
          } else { //Number
            NumberToken token = new NumberToken(cheese.substring(startMarker, index));            
            inAToken = false;
            tokenType = "";
            return token;
          }
        }
      }
    }
    NumberToken token = new NumberToken(cheese.substring(startMarker, cheese.length()));
    System.out.println("Here");
    return token;
  }
}
