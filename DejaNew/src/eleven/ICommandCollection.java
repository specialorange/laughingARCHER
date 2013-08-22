package eleven;

import java.util.ArrayList;

public interface ICommandCollection {
	public void addCommand(ICommand command);
	public void removeCommand(int index);
	public ArrayList<ICommand> getCC();
	public ICommand getCommand(int i);
	public int size();
	public void incrementCurrentCommand();
	public void decrementCurrentCommand();
	public int getCurrentCommandIndex();
}
