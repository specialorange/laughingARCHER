package graphics;

public class ASetWidthCommand implements Command{
  
  Line line;
  int newWidth;
  int steps;
  int pauseTime;
  int previousWidth;

  public ASetWidthCommand(Line line, int newWidth, int steps, int pauseTime){
    this.line=line;
    this.previousWidth=line.getWidth();
    this.newWidth=newWidth;
    this.steps=steps;
    this.pauseTime=pauseTime;
  }
  
  public void run() {
    /* MODIFY THIS TO CREATE AN ANIMATED VERSION */
    line.animateSetWidth(newWidth,steps,pauseTime);
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
    /* insert code to execute this command */
  }

  @Override
  public void undo() {
    newWidth = previousWidth;
    /* insert code to undo this command */
  }


}