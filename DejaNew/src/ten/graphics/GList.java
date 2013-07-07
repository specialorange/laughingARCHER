package ten.graphics;

import java.util.ArrayList;
//T stands for Type
//public class GList<IHalloween, ICandyList, ITokenCollection> implements IGlist<T> {
	public class GList<T> implements IGlist<T> {
	private ArrayList<T> list;
//	If halloween
	private IChild child;
//	If CandyList
	private int candyContainerHeight, candyContainerWidth, candyHeight;
	private IPoint candyContainerLocation;
	
	public GList<T> () {
		this.setArrayList(new ArrayList<T>());
	}
	public GList<T> (IChild child1) {
		this.setArrayList(new ArrayList<T>());
		this.child = child1;
	}
	public GList<T> (IPoint cCL, int cCH, int cCW, int cH) {
		this.setArrayList(new ArrayList<T>());
		this.candyContainerLocation = cCL;
		this.candyContainerHeight = cCH;
		this.candyContainerWidth = cCW;
		this.candyHeight = cH;
	}
	
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
}