package eleven;

import java.util.ArrayList;

public class ListenerList extends ArrayList<Listener> implements IListenerList{
	int commandCount = 0;
	
	public void addListener(Listener listener) {
		this.add(listener);
	}
	public void removeListener(Listener listener) {
		this.remove(listener);
	}
	public void add(int number) {
		commandCount += number;
	}
	public int getValue() {
		return commandCount;
	}
	
}