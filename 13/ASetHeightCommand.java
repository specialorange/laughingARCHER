package graphics;

public class ASetHeightCommand implements Command{
  
  Line line;
  int newHeight;
  int previousHeight;
  int steps;
  int pauseTime;

  public ASetHeightCommand(Line line, int newHeight, int steps, int pauseTime){
    this.line=line;
    this.previousHeight=line.getHeight();
    this.newHeight=newHeight;
    this.steps=steps;
    this.pauseTime=pauseTime;
  }
  
  public void run() {
    line.animateSetHeight(newHeight,steps,pauseTime);
  }
  
  public void sleep() {
    try {
      // OS suspends program for pauseTime
      Thread.sleep(pauseTime);
    } catch (InterruptedException e) {
      // program may be forcibly interrupted while sleeping
      e.printStackTrace();
    }
  }

  @Override
  public void execute() {
    /* insert code to undo this command */
  }

  @Override
  public void undo() {
    newHeight = previousHeight;
    /* insert code to undo this command */
  }
}