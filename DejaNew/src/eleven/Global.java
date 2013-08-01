package eleven;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Global {
	public static ArrayList<PropertyChangeListener> listenerList;
	
//	public static Undoer getUndoer() {return undoer;}
//	public static Redoer getUndoer() {return undoer;}
	public static ArrayList<PropertyChangeListener> getListenerList() {return listenerList;}
	public static void setListenerList(ArrayList<PropertyChangeListener> listenerList) {Global.listenerList = listenerList;}
}
