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
		this.process(input);
	}

	public void process(String input) {
	  this.tokenCollection = scanner.setAndProcess(input, this.tokenCollection);
	  processCommands(this.tokenCollection);
	}
	public void processCommands(ITokenCollection tokenCollection){
  	for ( int index = 0; index < tokenCollection.size(); index++ ) {
  		if (tokenCollection.getToken(index) instanceof MoveWordToken) {
  			neighborhood.moveChildBy(Integer.parseInt(tokenCollection.getToken(index+1).toString()), Integer.parseInt(tokenCollection.getToken(index+1).toString()));
  			index = index+2;
  		} else if (tokenCollection.getToken(index) instanceof AddHouseWordToken) {
  			neighborhood.addHome();
  		} else if (tokenCollection.getToken(index) instanceof RemoveHouseWordToken) {
  			neighborhood.removeLastHome();
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
