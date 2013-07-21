package eleven;

public class ObservedChild extends Observed implements IObserved{
	private boolean attached;
	
	public boolean isAttached(){
		return this.attached;
	}
}
