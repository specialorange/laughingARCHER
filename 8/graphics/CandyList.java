package eight.graphics;

import java.util.ArrayList;

public class CandyList implements ICandyList {
	private ArrayList<Candy> candyList;
	private int candyContainerHeight, candyContainerWidth, candyHeight;
	private IPoint candyContainerLocation;
	
	public CandyList(int width, int height, IPoint candyContainerLocation, int defaultCandyCount){
		this.setCandyContainerWidth(width);
		this.setCandyContainerHeight(height);
		this.candyList = new ArrayList<Candy>();
		this.setCandyContainerLocation(candyContainerLocation);
		for (int i=0; i<defaultCandyCount; i++) {
			this.addCandy();
		}
	};
	
	public void addCandy(Candy candy){
		this.candyList.add(candy);
	}
	public void addCandy(){
		int verticalSpaceLeft = candyContainerHeight - candyHeight;
		int newYLocation = candyContainerLocation.getY()+verticalSpaceLeft;
		this.setCandyHeight(this.getCandyHeight()+(new Candy().getHeight()));
		this.candyList.add(new Candy(this.getCandyContainerLocation().getX(), newYLocation));
	}	
	public void removeLastCandy(){
		this.setCandyHeight(this.getCandyHeight()-candyList.get(candyList.size()-1).getHeight());
		this.candyList.remove(candyList.size()-1);
	}
	public ArrayList<Candy> getCandyList() {
		return this.candyList;
	}
	public void setCandyList(ArrayList<Candy> candyList) {
		this.candyList = candyList;
	}
	public int getCandyContainerHeight() {
		return this.candyContainerHeight;
	}
	public void setCandyContainerHeight(int candyContainerHeight) {
		this.candyContainerHeight = candyContainerHeight;
	}
	public int getCandyContainerWidth() {
		return this.candyContainerWidth;
	}
	public void setCandyContainerWidth(int candyContainerWidth) {
		this.candyContainerWidth = candyContainerWidth;
	}
	public int getCandyHeight() {
		return this.candyHeight;
	}
	public void setCandyHeight(int candyHeight) {
		this.candyHeight = candyHeight;
	}
	public IPoint getCandyContainerLocation() {
		return this.candyContainerLocation;
	}
	public void setCandyContainerLocation(IPoint candyContainerLocation) {
		this.candyContainerLocation = candyContainerLocation;
	}
}