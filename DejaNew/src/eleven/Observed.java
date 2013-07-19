package eleven;

public class Observed implements IObserved{
	int commandCount = 0;
	ListenerList listenerList = new ListenerList();

	public void addListener(Listener listener) {
	}
	public void removeListener(Listener listener) {
	}
	public void add(int amount) {
		this.commandCount += amount;
		this.notifyListeners();
	}
	public int getValue() {
		return this.commandCount;
	}
  void notifyListeners() {
  	for (int i = 0 ; i < listenerList.size() ; i++ ) {
  		listenerList.get(i).update(this);
  	}
  }
}
