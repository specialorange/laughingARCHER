package eleven;

import java.util.ArrayList;

import nine.graphics.Halloween;
import nine.graphics.IHalloween;

public class Parser implements IParser {

	private ITokenCollection tokenCollection;
	private ArrayList commandCollection;
	private IHalloween halloweenNeighborhood;
	protected Scanner scanner;
	
	public Parser(String input) {
		scanner = new Scanner();
		setHalloweenNeighborhood(new Halloween());
		scanner.setTokenCollection(new TokenCollection());
		this.setOriginalString(input);
	}

	public void setOriginalString(String input) {
	  scanner.setOriginalString(input);
	  scanner.tokensInArray(scanner.getTokenCollection());
//	  setting here to not get confused
	  this.tokenCollection = scanner.getTokenCollection();
	  processCommands(tokenCollection);
	}
	public void processCommands(ITokenCollection tokenCollection){
	    boolean inACommand = false;
	    int startMarker = 0;
	    if (!inACommand) {
	    	for ( int index = startMarker; index < tokenCollection.size(); index++ ) {
	    		scanner.wordOrNumberRD(tokenCollection, index);
	    	}
	    }
	}
	public ITokenCollection getTokenCollection() {
		return this.tokenCollection;
	}
	public void setTokenCollection(ITokenCollection tokenCollection) {
		this.tokenCollection = tokenCollection;
	}
	public IHalloween getHalloweenNeighborhood() {
		return this.halloweenNeighborhood;
	}
	public void setHalloweenNeighborhood(IHalloween halloweenNeighborhood) {
		this.halloweenNeighborhood = halloweenNeighborhood;
	}
	public String getConcatenation() {
		return scanner.getConcatenation();
	}
}
