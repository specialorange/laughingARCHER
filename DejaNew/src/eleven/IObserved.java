package eleven;

public interface IObserved {
	public void addCommandToken(Token token);
	public Token getLastToken();
}
