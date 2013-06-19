package main;

import history.*;
import stringhistory.*;

public class Recitation10 {
  
  public static void main(String[] args){
    
    History<Integer> intHistory = new ArrayListHistory<Integer>();
    intHistory.addElement(new Integer(0));
    intHistory.addElement(new Integer(1));
    intHistory.addElement(new Integer(2));
    
    History<String> stringHistory = new VectorHistory<String>();
    stringHistory.addElement("Hi there!");
    stringHistory.addElement("How are you?");
    
    StringHistory stringHistory2 = new VectorStringHistory();
    stringHistory2.addElement("I'm StringHistory");
    stringHistory2.addElement("number two!");
    
    for (int x=0;x<intHistory.size();x++)
      System.out.println(intHistory.elementAt(x));
    
    System.out.println();
    for (int x=0;x<stringHistory.size();x++)
      System.out.println(stringHistory.elementAt(x));
    
    System.out.println();
    for (int x=0;x<stringHistory2.size();x++)
      System.out.println(stringHistory2.elementAt(x));
    
  }

}