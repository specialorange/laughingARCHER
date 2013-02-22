package recitation11;

import recitation11.graphics.interfaces.LineEditor;
import recitation11.graphics.interfaces.*;

public class ALineEditor implements LineEditor {

  Line lineEdit;
  
  public ALineEditor(Line l) {
    lineEdit = l;
  }
  public int getLineWidth() {
    return lineEdit.getWidth();
  }

  public void setLineWidth(int newWidth) {
    lineEdit.setWidth(newWidth);
  }
  @Override
  public int getLineHeight() {
    return lineEdit.getHeight();
  }
  @Override
  public void setLineHeight(int newHeight) {
    lineEdit.setHeight(newHeight);
  }
  @Override
  public int getLineXValue() {
    return lineEdit.getLocation().getX();
  }
  @Override
  public void setLineXValue(int newLineX) {
    lineEdit.setX(newLineX);
  }
  @Override
  public int getLineYValue() {
    return lineEdit.getLocation().getY();
  }
  @Override
  public void setLineYValue(int newLineY) {
    lineEdit.setY(newLineY);
  }
  
}