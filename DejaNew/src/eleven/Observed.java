package eleven;

public class Observed implements IObserved{
	TokenCollection tC = new TokenCollection();
	ListenerList listenerList = new ListenerList();

	public void addListener(Listener listener) {
		listenerList.addListener(listener);
		listener.update(this);
	}
	public void removeListener(Listener listener) {
		listenerList.removeListener(listener);
	}
	public void addCommandToken(Token token) {
		this.tC.addToken(token);
		this.notifyListeners();
	}
	public Token getLastToken() {
		return this.tC.getLastToken();
	}
	
//	HERE, is this private by omitting private?
  void notifyListeners() {
  	for (int i = 0 ; i < listenerList.size() ; i++ ) {
  		listenerList.get(i).update(this);
  	}
  }
}
