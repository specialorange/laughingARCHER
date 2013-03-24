package ass4;

import ass4.NumberToken;
import ass4.WordToken;

public class Tokenizer implements TokenizerInterface {
	private String originalString = "";
	private String concatenation = "";
	
	private void tokensInArray() {
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
				if (inAToken) { 
					if (tokenType == "Word") {
			            WordToken token = new WordToken(originalString.substring(startMarker, index));
			            concatenation += token.getDescription() + ": " + token.getStringValue() + " ";
						inAToken = false;
						tokenType = "";
					} else { //Number
			            NumberToken token = new NumberToken(originalString.substring(startMarker, index));            
						concatenation += token.getDescription() + ": " + token.getStringValue() + " ";						
						inAToken = false;
						tokenType = "";
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
}
