package graphics;

public class ASetWidthCommand implements Runnable{
  
  Line line;
  int newWidth;
  int steps;
  int pauseTime;

  public ASetWidthCommand(Line line, int newWidth, int steps, int pauseTime){
    this.line=line;
    this.newWidth=newWidth;
    this.steps=steps;
    this.pauseTime=pauseTime;
  }
  
  public void run() {
    /* Your code here */
  }

}