package seven;


public class Scanner implements IScanner {
  
//  How to import or access the Inherited attributes 
  
  private String originalString;
  private String concatenation = "";
  private ITokenCollection tokenCollection;
  
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
            if (substr.equals("move") || substr.equals("mv") || substr.equals("moov") ) {
              tokenCollection.addToken(new MoveWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("redo") || substr.equals("rd") || substr.equals("reedoo") ) {
              tokenCollection.addToken(new RedoWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("give") || substr.equals("gv") ) {
              tokenCollection.addToken(new GiveWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("undo") || substr.equals("ud") || substr.equals("undoo") ) {
              tokenCollection.addToken(new UndoWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("addhouse") || substr.equals("ah") ) {
              tokenCollection.addToken(new AddHouseWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("animate") || substr.equals("a") ) {
              tokenCollection.addToken(new AnimateWordToken(originalString.substring(startMarker, index)));
              this.addConcatenation();
            } else if (substr.equals("take") || substr.equals("t") || substr.equals("tk") ) {
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
