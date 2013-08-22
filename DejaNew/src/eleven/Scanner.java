package eleven;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Scanner implements IScanner {
  
  private String originalString;
  private String concatenation = "";
  private ITokenCollection tokenCollection;
  private ICommandCollection commandCollection;
  private final Set<String> wordMoveTokens = new HashSet<String>(Arrays.asList("move", "mv", "moov"));
  private final Set<String> wordRedoTokens = new HashSet<String>(Arrays.asList("redo", "rd", "reedoo"));
  private final Set<String> wordGiveTokens = new HashSet<String>(Arrays.asList("give", "gv"));
  private final Set<String> wordUndoTokens = new HashSet<String>(Arrays.asList("undo", "ud", "undoo"));
  private final Set<String> wordAddHouseTokens = new HashSet<String>(Arrays.asList("addhouse", "ah", "add"));
  private final Set<String> wordRemoveHouseTokens = new HashSet<String>(Arrays.asList("removehouse", "rm", "remove"));
  private final Set<String> wordAnimateTokens = new HashSet<String>(Arrays.asList("animate", "am"));
  private final Set<String> wordTakeTokens = new HashSet<String>(Arrays.asList("take", "tk"));
  private int markerPositionForTokens = 0;
  
  public Scanner() {  	
  }
  
  public Scanner(ITokenCollection tC, ICommandCollection cC) {
    setTokenCollection(tC);
    setCommandCollection(cC);
  }

  public IToken nextToken() {
    //advance till find a letter
  	while ( markerPositionForTokens<originalString.length() && this.isCharSpace(originalString.charAt(markerPositionForTokens)) ){
  		markerPositionForTokens ++;
  	}
  	//  make a note of index
  	int start = markerPositionForTokens;
  	//  advance till find a space
  	while ( markerPositionForTokens<originalString.length() && !this.isCharSpace(originalString.charAt(markerPositionForTokens)) ){
  		markerPositionForTokens ++;
  	}
  	int end = markerPositionForTokens;
  	while ( markerPositionForTokens<originalString.length() && this.isCharSpace(originalString.charAt(markerPositionForTokens)) ){
  		markerPositionForTokens ++;
  	}
  	
  	String nextTokenString = originalString.substring(start, end);
  	IToken nextToken = stringToToken(nextTokenString);
  	tokenCollection.addToken(nextToken);
  	return nextToken;
  }
  
  public void processTokensIntoCommands(){
  	while ( hasMoreCharacters() ) {  		
  		IToken nextToken = nextToken();
  		// is the next token a command?
  		if ( isTokenTwoParamCommand(nextToken) ) {
  			IToken tokenParam1 = nextToken();
  			IToken tokenParam2 = nextToken();
  			if (tokenParam1 instanceof NumberToken ) {
  				if (tokenParam2 instanceof NumberToken) {
  					ICommand command = new Command(nextToken, tokenParam1, tokenParam2);
  					commandCollection.addCommand(command);
  				} else {
  					System.out.println("input argument 2 is not a valid token");
  				}
  			} else {
  				System.out.println("input argument 1 is not a valid token");
  			}
  		} else if (isTokenZeroParamCommand(nextToken) ) {
  			ICommand command = new Command(nextToken);
  			commandCollection.addCommand(command);
  		} else {
  			System.out.println("input is not a valid token");
  		}
  	}
  }

  public ITokenCollection setAndProcess(String input) {
    this.originalString = input;
    this.processTokensIntoCommands();
    return this.tokenCollection;
  } 
  public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
	public String getConcatenation() {
    return this.concatenation;
  }
  public void addConcatenation() {
      this.concatenation += this.tokenCollection.getLastTokenStringConcatenation();
  }
  public ITokenCollection getTokenCollection() {
    return this.tokenCollection;
  }
  public void setTokenCollection(ITokenCollection tC) {
    this.tokenCollection = tC;
  }
  public ICommandCollection getCommandCollection() {
    return commandCollection;
  }
  public void setCommandCollection(ICommandCollection cC) {
    this.commandCollection = cC;
  }
  public boolean isCharNumberKind(char c){
  	if (Character.isDigit(c) || c == "+".charAt(0) || c == "-".charAt(0) ) {
  		return true;
  	} else {
  		return false;
  	}
  }
  public boolean isStringNumberToken(String string){
  	return isStringNumberToken(string, 0);
  }
  public boolean isStringNumberToken(String string, int index){
  	return ( index<string.length() && isCharNumberKind(string.charAt(index)) ) || ( index >= string.length() || isStringNumberToken(string, index+1) );
  }
  public boolean isCharLetter(char c){
  	if (Character.isLetter(c)) {
  		return true;
  	} else {
  		return false;
  	}
  }
  public boolean isCharOther(char c){
  	if (isCharNumberKind(c) || Character.isLetter(c) || Character.isSpaceChar(c) ) {
  		return false;
  	} else {
  		return true;
  	}
  }
  public boolean isCharSpace(char c){
  	if (Character.isSpaceChar(c)) {
  		return true;
  	} else {
  		return false;
  	}
  }
  public boolean isTokenZeroParamCommand(IToken token) {
  	//  	maybe make a hash set? RedoWordToken.class as a member
  	// maybe add a grouping to the interface?
  	// 
  	return (token instanceof RedoWordToken ||
  			token instanceof RemoveHouseWordToken ||
  			token instanceof GiveWordToken ||
  			token instanceof UndoWordToken ||
  			token instanceof AddHouseWordToken ||
  			token instanceof AnimateWordToken ||
  			token instanceof TakeWordToken );
  }
  public boolean isTokenTwoParamCommand(IToken token) {
  	return (token instanceof MoveWordToken);
  }
  public IToken stringToToken(String string) {
	  if (wordMoveTokens.contains(string)) {
	  	return new MoveWordToken(string);
	  } else if (wordRemoveHouseTokens.contains(string) ) {
	  	return new RemoveHouseWordToken(string);
	  } else if (wordRedoTokens.contains(string) ) {
	  	return new RedoWordToken(string);
	  } else if (wordGiveTokens.contains(string) ) {
	  	return new GiveWordToken(string);
	  } else if (wordUndoTokens.contains(string) ) {
	  	return new UndoWordToken(string);
	  } else if (wordAddHouseTokens.contains(string) ) {
	  	return new AddHouseWordToken(string);
	  } else if (wordAnimateTokens.contains(string) ) {
	  	return new AnimateWordToken(string);
	  } else if (wordTakeTokens.contains(string) ) {
	  	return new TakeWordToken(string);
	  } else if (isStringNumberToken(string)) {
	  	return new NumberToken(string);
	  } else {
	  	System.out.println("bad string");
	  	return null;
	  }
  }
  public boolean hasMoreCharacters() {
  	return ( markerPositionForTokens < originalString.length() );
  }
}
