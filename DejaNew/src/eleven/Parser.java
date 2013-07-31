package eleven;

import java.util.ArrayList;

import eleven.graphics.INeighborhood;
import eleven.graphics.Neighborhood;

public class Parser implements IParser {

	private ITokenCollection tokenCollection = new TokenCollection();
	private INeighborhood neighborhood;
	protected Scanner scanner = new Scanner();
  private ArrayList<String> commandCollection;

	public Parser(String input, INeighborhood neighborhood) {
		setNeighborhood(new Neighborhood());
		this.processInput(input);
	}

	public void processInput(String input) {
	  this.tokenCollection = scanner.setAndProcess(input, this.tokenCollection);
	  processCommands(this.tokenCollection);
	}
	public void processCommands(ITokenCollection tokenCollection){
  	for ( int index = 0; index < tokenCollection.size(); index++ ) {
  		if (tokenCollection.getToken(index) instanceof MoveWordToken) {
				neighborhood.moveChildBy(Integer.parseInt(tokenCollection.getToken(index+1).toString()),Integer.parseInt(tokenCollection.getToken(index+2).toString()));
  			index = index+2;
  			commandCollection.add( tokenCollection.getToken(index) + " " + tokenCollection.getToken(index+1) + " " + tokenCollection.getToken(index+2) + " " );
  			System.out.println("ONLY IN PARSER moving child");
  		} else if (tokenCollection.getToken(index) instanceof AddHouseWordToken) {
  			neighborhood.addHome();
  			commandCollection.add( tokenCollection.getToken(index) + " " );
  			System.out.println("adding house");
  		} else if (tokenCollection.getToken(index) instanceof RemoveHouseWordToken) {
  			neighborhood.removeLastHome();
  			commandCollection.add( tokenCollection.getToken(index) + " " );
  			System.out.println("removing house");
  		} else if (tokenCollection.getToken(index) instanceof AnimateWordToken) {
  			neighborhood.setAnimate(!(neighborhood.isAnimate()));
  			commandCollection.add( tokenCollection.getToken(index) + " " );
  			System.out.println("Toggle Animation");
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
	public ArrayList<String> getCommandCollection() {
		return this.commandCollection;
	}
	public void setCommandCollection(ArrayList<String> commandCollection) {
		this.commandCollection = commandCollection;
	}
}
