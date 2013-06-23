package eight;

import eight.graphics.Halloween;
import eight.graphics.IHalloween;

public class Parser extends Scanner implements IParser {

	private ITokenCollection tokenCollection;
	private IHalloween halloweenNeighborhood;
	
	public Parser(IHalloween neighborhood) {
		setHalloweenNeighborhood(neighborhood);
	}

	@Override
//	TODO
//	Why is changing this method to private require adjusting the security scope of the Parent Class Scanner as well?
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
	    		if (tokenCollection.getToken(index) instanceof MoveWordToken ){
	    			System.out.println("Its a move: ");
	    			NumberToken number1 = (NumberToken) tokenCollection.getToken(index+1);
	    			NumberToken number2 = (NumberToken) tokenCollection.getToken(index+2);
	    			if ( !(number1 instanceof NumberToken) || !(number2 instanceof NumberToken)){
	    				System.out.println("You have an incomplete parameter in the Move Command");
	    			} else {
	    				int n1 = Integer.parseInt(number1.toString());
	    				int n2 = Integer.parseInt(number2.toString());
	    				getHalloweenNeighborhood().moveChildBy(n1, n2);
	    				System.out.println("moved child by : "+ n1 + " x " + n2);
	    				startMarker = index+2;
	    			}
	    		} else if (tokenCollection.getToken(index) instanceof AddHouseWordToken) {
	    			getHalloweenNeighborhood().addHome();
	    			System.out.println("added home");
	    			startMarker ++;
	    		} else if (tokenCollection.getToken(index) instanceof RemoveHouseWordToken) {
	    			getHalloweenNeighborhood().removeLastHome();
	    			System.out.println("removed home");
	    			startMarker ++;
	    		} else {
	    			System.out.println("other");
	    		}
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
