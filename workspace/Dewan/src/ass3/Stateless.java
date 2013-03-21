package ass3;

public class Stateless {

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
    return(concatenation);
  }
}
