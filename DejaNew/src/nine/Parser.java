package nine;

import nine.graphics.Halloween;
import nine.graphics.IHalloween;

public class Parser extends Scanner implements IParser {

	private ITokenCollection tokenCollection;
	private IHalloween halloweenNeighborhood;
	
	public Parser(IHalloween neighborhood) {
		setHalloweenNeighborhood(neighborhood);
	}

	@Override
	public void setOriginalString(String input) {
	  super.setOriginalString(input);
	  super.tokensInArray();
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
	public void wordOrNumberRD(ITokenCollection tC, int index) {
		if (tC.getToken(index) instanceof WordToken) {
			wordParamCountRD(tC, index);
		} else if (tC.getToken(index) instanceof NumberToken) {
			System.out.println("Number Token");
		} else {
			System.out.println("Not a Word or Number Token");
		}
	}
	public void wordParamCountRD(ITokenCollection tC, int index) {
		System.out.println(index);
		if (index+2 <= tC.size() && tC.getToken(index+1) instanceof NumberToken && tC.getToken(index+2) instanceof NumberToken) {
			wordTwoParamRD(tC, index);
		} else if (index+1 <= tC.size() && tC.getToken(index+1) instanceof NumberToken) {
			wordOneParamRD();
		} else {
			wordZeroParamRD(tC, index);
		}
	}
	public void wordZeroParamRD(ITokenCollection tC, int index) {
		if (tC.getToken(index) instanceof AddHouseWordToken) {
			getHalloweenNeighborhood().addHome();
			System.out.println("added a house");
		} else if (tC.getToken(index) instanceof RemoveHouseWordToken) {
			getHalloweenNeighborhood().removeLastHome();
			System.out.println("removed a house");			
		}
	}
	public void wordOneParamRD(){
//		dont have one yet
	}
	public void wordTwoParamRD(ITokenCollection tC, int index) {
		if (tC.getToken(index) instanceof MoveWordToken) {
			getHalloweenNeighborhood().moveChildBy(((NumberToken) tC.getToken(index+1)).toInt(), ((NumberToken) tC.getToken(index+2)).toInt());
			System.out.println("moved Child by: "+ tC.getToken(index+1) + " by " + tC.getToken(index+2) );
		}
	}
}
