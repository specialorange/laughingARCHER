package eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Scanner implements IScanner {
  
private String originalString;
  private String concatenation = "";
  private ITokenCollection tokenCollection;
  private final Set<String> wordMoveTokens = new HashSet<String>(Arrays.asList("move", "mv", "moov"));
  private final Set<String> wordRedoTokens = new HashSet<String>(Arrays.asList("redo", "rd", "reedoo"));
  private final Set<String> wordGiveTokens = new HashSet<String>(Arrays.asList("give", "gv"));
  private final Set<String> wordUndoTokens = new HashSet<String>(Arrays.asList("undo", "ud", "undoo"));
  private final Set<String> wordAddHouseTokens = new HashSet<String>(Arrays.asList("addhouse", "ah"));
  private final Set<String> wordAnimateTokens = new HashSet<String>(Arrays.asList("animate", "a", "am"));
  private final Set<String> wordTakeTokens = new HashSet<String>(Arrays.asList("take", "tk"));
  
  private void tokensInArray() {
	tokenCollection = new TokenCollection();
    boolean inAToken = false;
    int startMarker = 0;
    String tokenType = new String();
    for ( int index = 0; index < originalString.length(); index++ ) {
      char tokenChar = originalString.charAt(index);
      if (Character.isDigit(tokenChar) || tokenChar == "+".charAt(0) || tokenChar == "-".charAt(0)) {
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
      this.concatenation += this.tokenCollection.getLastTokenStringConcatenation();
  }
}
