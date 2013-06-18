package eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Scanner implements IScanner {
  
//  How to import or access the Inherited attributes 
  
  private String originalString;
  private String concatenation = "";
  private ITokenCollection tokenCollection;
  private Set<String> wordMoveTokens = new HashSet<String>(Arrays.asList("move", "mv", "moov"));
  private Set<String> wordRedoTokens = new HashSet<String>(Arrays.asList("redo", "rd", "reedoo"));
  private Set<String> wordGiveTokens = new HashSet<String>(Arrays.asList("give", "gv"));
  private Set<String> wordUndoTokens = new HashSet<String>(Arrays.asList("undo", "ud", "undoo"));
  private Set<String> wordAddHouseTokens = new HashSet<String>(Arrays.asList("addhouse", "ah"));
  private Set<String> wordAnimateTokens = new HashSet<String>(Arrays.asList("animate", "a", "am"));
  private Set<String> wordTakeTokens = new HashSet<String>(Arrays.asList("take", "tk"));
  
  private void tokensInArray() {
	tokenCollection = new TokenCollection();
    boolean inAToken = false;
    int startMarker = 0;
    String tokenType = new String();
    for ( int index = 0; index < originalString.length(); index++ ) {
      char tokenChar = originalString.charAt(index);
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
        if (inAToken) { //and end of a token 
          if (tokenType == "Word") {
            String substr = originalString.substring(startMarker, index).toLowerCase();
            System.out.println("|" + substr + "|");
            if (wordMoveTokens.contains(substr) ) {
              tokenCollection.addToken(new MoveWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordRedoTokens.contains(substr) ) {
              tokenCollection.addToken(new RedoWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordGiveTokens.contains(substr) ) {
              tokenCollection.addToken(new GiveWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordUndoTokens.contains(substr) ) {
              tokenCollection.addToken(new UndoWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordAddHouseTokens.contains(substr) ) {
              tokenCollection.addToken(new AddHouseWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordAnimateTokens.contains(substr) ) {
              tokenCollection.addToken(new AnimateWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (wordTakeTokens.contains(substr) ) {
              tokenCollection.addToken(new TakeWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else {
              tokenCollection.addToken(new WordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            }
            startMarker = index;
            inAToken = false;
            tokenType = "";
          } else { //Number
            tokenCollection.addToken(new NumberToken(originalString.substring(startMarker, index)));            
            concatenation += tokenCollection.getToken(tokenCollection.getTC().size()-1).getDescription() + ": " + tokenCollection.getToken(tokenCollection.getTC().size()-1).getStringValue() + " ";            
            inAToken = false;
            tokenType = "";
            startMarker = index;
          }
        }
      }
    }
  }

  public void setOriginalString(String input) {
    this.originalString = input;
    this.tokensInArray();
  }
  
  public String getConcatenation() {
    return this.concatenation;
  }
  public void addConcatenation() {
//	  TODO  I am unsure of the error "The method getLastTokenStringConcatenation() is undefined for the type ArrayList<Token>" when the line below is uncommented I tried to work this out, but couldn't get it
      this.concatenation += this.tokenCollection.getLastTokenStringConcatenation();
  }
}
