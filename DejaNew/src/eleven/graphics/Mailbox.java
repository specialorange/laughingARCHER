package eleven.graphics;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class Mailbox extends Stick implements IMailbox {
	private IRectangle box;
	private ArrayList<PropertyChangeListener> listenerList;
	
	public Mailbox(ArrayList<PropertyChangeListener> listenerList) {
		super(100,100,20,20, listenerList);
		this.setBox(new Rectangle(100, 100, 20, 20));
		this.setListenerList(listenerList);
	}
	//	100, 100, 0, 30, 20, 20
	public Mailbox(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight, ArrayList<PropertyChangeListener> listenerList) {
		super(originX, originY, lineWidth, lineHeight, listenerList);
		this.setBox(new Rectangle( originX, originY, boxWidth, boxHeight));
		this.setListenerList(listenerList);
	}
	public ArrayList<PropertyChangeListener> getListenerList() {
		return listenerList;
	}
	public void setListenerList(ArrayList<PropertyChangeListener> listenerList) {
		this.listenerList = listenerList;
	}
	
	public void changeLocationTo(int x, int y) {
		this.getLocation().changeLocationTo(x, y);
		this.getBox().changeLocationTo(x, y);
		this.getBottom().changeLocationTo(x, y);		
	}
	@Override
	public void changeLocationBy(int x, int y) {
		this.getLocation().changeLocationTo(x, y);
		this.getBox().changeLocationTo(x, y);
		this.getBottom().changeLocationTo(x, y);		
	}
	public IRectangle getBox() {
		return this.box;
	}
	public void setBox(IRectangle rectangle) {
		this.box = rectangle;
	}
}