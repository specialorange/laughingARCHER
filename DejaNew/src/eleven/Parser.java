package eleven;

import java.util.ArrayList;
import eleven.graphics.INeighborhood;
import eleven.graphics.Neighborhood;

public class Parser implements IParser {

	private ITokenCollection tokenCollection = new TokenCollection();
  private ICommandCollection cC = new CommandCollection();
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
	public void processCommands(ICommandCollection commandCollection){
  	for ( int i = 0; i < commandCollection.size(); i++ ) {
  		if (commandCollection.getCommand(i).getCurrentToken() instanceof MoveWordToken) {
				neighborhood.moveChildBy( Integer.parseInt(commandCollection.getCommand(i).getPrevNum1().toString()),
						                      Integer.parseInt(commandCollection.getCommand(i).getPrevNum2().toString())  );
  			commandCollection.incrementCurrentCommand();
  			System.out.println("ONLY IN PARSER moving child");
  		} else if (commandCollection.getCommand(i).getCurrentToken() instanceof AddHouseWordToken) {
  			neighborhood.addHome();
  			commandCollection.incrementCurrentCommand();
  			System.out.println("adding house");
  		} else if (commandCollection.getCommand(i).getCurrentToken() instanceof RemoveHouseWordToken) {
  			neighborhood.removeLastHome();
  			commandCollection.incrementCurrentCommand();
  			System.out.println("removing house");
  		} else if (commandCollection.getCommand(i).getCurrentToken() instanceof AnimateWordToken) {
  			neighborhood.setAnimate(!(neighborhood.isAnimate()));
  			commandCollection.incrementCurrentCommand();
  			System.out.println("Toggle Animation");
  		} else if (commandCollection.getCommand(i).getCurrentToken() instanceof UndoWordToken) {
  			commandCollection.decrementCurrentCommand();
  			IToken undo = commandCollection.getCommand(commandCollection.getCurrentCommandIndex()).getOppositeToken();
  			System.out.println("UNDO!!");
  		} else if (commandCollection.getCommand(i).getCurrentToken() instanceof RedoWordToken) {
  			commandCollection.incrementCurrentCommand();
  			IToken redo = commandCollection.getCommand(commandCollection.getCurrentCommandIndex()).getCurrentToken();
  			System.out.println("REDO!!");
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
	public ICommandCollection getCommandCollection() {
		return this.cC;
	}
	public void setCommandCollection(ICommandCollection cC) {
		this.cC = cC;
	}
	public Scanner getScanner() {
		return this.scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
