package graphics;

import java.util.List;
import java.util.Vector;

public class ACommandUndoer implements Undoer {
  List<Command> commandList = new Vector<Command>();
  int nextCommandIndex = 0;
  @Override
  public void undo() {
    if(nextCommandIndex == 0) return;
    nextCommandIndex--;
    commandList.get(nextCommandIndex).undo();
  }

  @Override
  public void execute(Command c) {
    if(nextCommandIndex != commandList.size()) {
      commandList.clear();
      nextCommandIndex = 0;
    }
    c.execute();
    commandList.add(c);
    nextCommandIndex++;
  }

  @Override
  public void redo() {
    if(nextCommandIndex == commandList.size()){
      commandList.get(nextCommandIndex).execute();
      nextCommandIndex++;
    }
  }
  
}