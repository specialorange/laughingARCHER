package main;
import graphics.*;
import bus.uigen.ObjectEditor;

public class Recitation12 {
  public static void main(String[] args) {
    Line l = new ALine(10, 10, new APoint(20,20));
    LineEditor le = new ALineEditor(l);
    ObjectEditor.edit(l);
    ObjectEditor.edit(le);
  }
}