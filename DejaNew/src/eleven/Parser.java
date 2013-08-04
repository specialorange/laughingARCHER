package eleven;

import java.util.ArrayList;

import eleven.graphics.INeighborhood;
import eleven.graphics.Neighborhood;

public class Parser implements IParser {

	private ITokenCollection tokenCollection = new TokenCollection();
  private ArrayList<Command> cC = new ArrayList<Command>();
	private INeighborhood neighborhood;
	protected Scanner scanner;

	public Parser(String input, INeighborhood neighborhood) {
		setNeighborhood(new Neighborhood());
		setScanner(new Scanner(getTokenCollection(), getCommandCollection()));
		this.processInput(input);
	}

	public void processInput(String input) {
	  this.tokenCollection = scanner.setAndProcess(input);
	  processCommands(getCommandCollection());
	}
	public void processCommands(ArrayList<Command> cC){
  	for ( int i = 0; i < cC.size(); i++ ) {
  		if (cC.get(i).getCurrentToken() instanceof MoveWordToken) {
				neighborhood.moveChildBy(Integer.parseInt(cC.get(i).getPrevNum1().toString()),Integer.parseInt(cC.get(i).getPrevNum2().toString()));
  			System.out.println("ONLY IN PARSER moving child");
  		} else if (cC.get(i).getCurrentToken() instanceof AddHouseWordToken) {
  			neighborhood.addHome();
  			System.out.println("adding house");
  		} else if (cC.get(i).getCurrentToken() instanceof RemoveHouseWordToken) {
  			neighborhood.removeLastHome();
  			System.out.println("removing house");
  		} else if (cC.get(i).getCurrentToken() instanceof AnimateWordToken) {
  			neighborhood.setAnimate(!(neighborhood.isAnimate()));
  			System.out.println("Toggle Animation");
  		} else if (cC.get(i).getCurrentToken() instanceof UndoWordToken) {
  			System.out.println("Toggle Animation");
  		} else if (cC.get(i).getCurrentToken() instanceof RedoWordToken) {
  			System.out.println("Toggle Animation");
  		}
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
	public ArrayList<Command> getCommandCollection() {
		return this.cC;
	}
	public void setCommandCollection(ArrayList<Command> cC) {
		this.cC = cC;
	}
	public Scanner getScanner() {
		return this.scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
