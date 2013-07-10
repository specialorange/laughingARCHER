package ten.graphics;

import java.util.ArrayList;
	public class Stack<T> implements IStack<T> {
	protected ArrayList<T> list;
	
	public Stack() {
		this.setArrayList(new ArrayList<T>());
	}
	
	public void addItem(T e) {
		this.list.add(e);
	}
	public void removeLastItem() {
		this.list.remove(list.size()-1);
	}
	public ArrayList<T> getArrayList() {
		return this.list;
	}
	public void setArrayList(ArrayList<T> list) {
		this.list = list;
	}
	public T get(int number) {
		return (T) list.get(number);
//	TODO 		I am forcing a return type of the item in the ArrayList<T> list;
	}
}