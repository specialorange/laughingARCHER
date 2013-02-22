package graphics;

public interface Undoer {
  public void undo();
  public void execute(Command c);
  public void redo();
}