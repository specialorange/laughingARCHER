package ten;

import java.util.ArrayList;

import nine.graphics.Halloween;
import nine.graphics.IHalloween;

public class Parser extends Scanner implements IParser {

	private ITokenCollection tokenCollection;
	private ArrayList commandCollection;
	private IHalloween halloweenNeighborhood;
	
	public Parser(String input) {
		setHalloweenNeighborhood(new Halloween());
		super.setTokenCollection(new TokenCollection());
		this.setOriginalString(input);
	}

	@Override
	public void setOriginalString(String input) {
	  super.setOriginalString(input);
	  super.tokensInArray(super.getTokenCollection());
//	  setting here to not get confused
	  this.tokenCollection = super.getTokenCollection();
	  processCommands(tokenCollection);
	}
	public void processCommands(ITokenCollection tokenCollection){
	    boolean inACommand = false;
	    int startMarker = 0;
	    if (!inACommand) {
	    	for ( int index = startMarker; index < tokenCollection.size(); index++ ) {
	    		wordOrNumberRD(tokenCollection, index);
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
		return super.getConcatenation();
	}
}
