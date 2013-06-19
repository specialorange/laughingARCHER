package recitation11;
import bus.uigen.ObjectEditor;
import recitation11.graphics.*;
import recitation11.graphics.interfaces.*;

public class Recitation11 {
  public static void main(String[] args) {
    Line l = new ALine(10, 10, new APoint(20,20));
    LineEditor le = new ALineEditor(l);
    ObjectEditor.edit(l);
    ObjectEditor.edit(le);
  }
}