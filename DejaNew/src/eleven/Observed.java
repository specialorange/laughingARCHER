package eleven;

import java.util.ArrayList;

public class Observed implements IObserved{
	TokenCollection tC = new TokenCollection();
	ArrayList<Listener> listenerList = new ArrayList<Listener>();

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
