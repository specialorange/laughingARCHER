package graphics;

public class ASetHeightCommand implements Runnable{
  
  Line line;
  int newHeight;
  int steps;
  int pauseTime;

  public ASetHeightCommand(Line line, int newHeight, int steps, int pauseTime){
    this.line=line;
    this.newHeight=newHeight;
    this.steps=steps;
    this.pauseTime=pauseTime;
  }
  
  public void run() {
    /* Your code here */
  }

}