package ten.graphics;

import java.util.ArrayList;

public interface IGlist<T> {
	
	public void addType(T e);
	public void removeLastType();
	public T getTypeAt(int i);	
	public ArrayList<T> getArrayList();
	public void setArrayList(ArrayList<T> list);

}
