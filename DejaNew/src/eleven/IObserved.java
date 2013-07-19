package eleven;

public interface IObserved {
	public void add(int amount);
	public int getValue();
	public void addListener(Listener listener);
	public void removeListener(Listener listener);
}
