package eleven;

public interface IObserved {
	public void addCommandToken(Token token);
	public Token getLastToken();
	public void addListener(Listener listener);
	public void removeListener(Listener listener);
}
