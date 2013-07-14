package eleven.graphics;

import java.util.ArrayList;

public interface IStack<T> {
	
	public void addItem(T e);
	public void removeLastItem();
	public ArrayList<T> getArrayList();
	public void setArrayList(ArrayList<T> list);
	public T get(int number);
}
