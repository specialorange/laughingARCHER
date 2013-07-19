package eleven;

public interface IListenerList {
	public void add(int number);
	public int getValue();
	public void addListener(Listener listener);
	public void removeListener(Listener listener);
}
