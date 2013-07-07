package ten.graphics;

import java.util.ArrayList;
//T stands for Type
//public class GList<IHalloween, ICandyList, ITokenCollection> implements IGlist<T> {
	public class GList<T> implements IGlist<T> {
	private ArrayList<T> list;
	
	public void addType(T e) {
		this.list.add(e);
	}
	public void removeLastType() {
		this.list.remove(list.size()-1);
	}
	public T getTypeAt(int i) {
		return this.list.get(i);
	}
	
	public ArrayList<T> getArrayList() {
		return this.list;
	}
	public void setArrayList(ArrayList<T> list) {
		this.list = list;
	}

//	If halloween
	private IChild child;
//	If CandyList
	private int candyContainerHeight, candyContainerWidth, candyHeight;
	private IPoint candyContainerLocation;

}
