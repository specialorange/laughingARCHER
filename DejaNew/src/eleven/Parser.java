package eleven;

import eleven.graphics.INeighborhood;
import eleven.graphics.Neighborhood;

public class Parser implements IParser {

	private ITokenCollection tokenCollection = new TokenCollection();
	private INeighborhood neighborhood;
	protected Scanner scanner = new Scanner();
	
	public Parser(String input, INeighborhood neighborhood) {
		setNeighborhood(new Neighborhood());
//		scanner.setTokenCollection(new TokenCollection());
		this.processInput(input);
	}

	public void processInput(String input) {
	  this.tokenCollection = scanner.setAndProcess(input, this.tokenCollection);
	  processCommands(this.tokenCollection);
	}
	public void processCommands(ITokenCollection tokenCollection){
  	for ( int index = 0; index < tokenCollection.size(); index++ ) {
  		if (tokenCollection.getToken(index) instanceof MoveWordToken) {
  			// Move in L shape
  			int nextToken = Integer.parseInt(tokenCollection.getToken(index+1).toString());
  			int secondToken = Integer.parseInt(tokenCollection.getToken(index+2).toString());
  			for (int x = 0 ; x < nextToken ; x++) {
  				neighborhood.moveChildBy(1,0);
  			}
  			for (int y = 0 ; y < secondToken ; y++) {
  				neighborhood.moveChildBy(0,1);
  			}
  			index = index+2;
  			System.out.println("ONLY IN PARSER moving child");
  		} else if (tokenCollection.getToken(index) instanceof AddHouseWordToken) {
  			neighborhood.addHome();
  			System.out.println("adding house");
  		} else if (tokenCollection.getToken(index) instanceof RemoveHouseWordToken) {
  			neighborhood.removeLastHome();
  			System.out.println("removing house");
  		} else { }
  	}
	}
	public ITokenCollection getTokenCollection() {
		return this.tokenCollection;
	}
	public void setTokenCollection(ITokenCollection tokenCollection) {
		this.tokenCollection = tokenCollection;
	}
	public INeighborhood getNeighborhood() {
		return this.neighborhood;
	}
	public void setNeighborhood(INeighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getConcatenation() {
		return scanner.getConcatenation();
	}
}
