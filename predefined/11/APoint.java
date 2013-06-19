package recitation11.graphics;

import recitation11.graphics.interfaces.Point;

public class APoint implements Point {
  int x, y;
  
  public APoint(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int getX() { 
    return x;
  }
  
  public int getY() {
    return y;
  }

  @Override
  public void setX(int newX) {
    x = newX;
  }

  @Override
  public void setY(int newY) {
    y = newY;
  }

}