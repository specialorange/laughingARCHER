package graphics;

public interface Command extends Runnable {
  public void execute();
  public void undo();
}