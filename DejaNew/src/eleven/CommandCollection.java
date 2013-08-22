package eleven;
import java.util.ArrayList;
import eleven.graphics.Stack;

//How to make TokenCollection an ArrayList itself
public class CommandCollection extends Stack<ICommandCollection> implements ICommandCollection{

	private ArrayList<ICommand> cC;		
	private int currentCommand = (Integer) null;
	
	public CommandCollection() {
		this.cC = new ArrayList<ICommand>();
	}
	public ICommand getCommand(int index){
		return cC.get(index);
	}
	public ArrayList<ICommand> getCC() {
		return this.cC;
	}
	public int size() {
		return this.cC.size();
	}
	public ICommand getLastToken() {
		return cC.get(cC.size()-1);
	}
	public void addCommand(ICommand command) {
		this.cC.add(command);
	}
	public void removeCommand(int index) {
		this.cC.remove(index);
	}
	public int getCurrentCommand() {
		return currentCommand;
	}
	public void setCurrentCommand(int currentCommand) {
		this.currentCommand = currentCommand;
	}
	public void incrementCurrentCommand() {
		if (currentCommand < this.cC.size()){			
			this.currentCommand += 1;
		}
	}
	public void decrementCurrentCommand() {
		if (currentCommand > 0) {			
			this.currentCommand += -1;
		}
	}
}
