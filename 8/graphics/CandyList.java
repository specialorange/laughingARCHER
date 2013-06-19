package eight.graphics;

import java.util.ArrayList;

import util.annotations.Visible;

public class CandyList implements ICandyList {
	private ArrayList<Candy> candyList;
	private int candyContainerHeight, candyContainerWidth, candyHeight;
	private IPoint candyContainerLocation;
	
	public CandyList(int width, int height, IPoint candyContainerLocation, int defaultCandyCount){
		this.setCandyContainerWidth(width);
		this.setCandyContainerHeight(height);
		this.setCandyHeight(new Candy().getHeight());
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
//		if ( heighter < this.getCandyHeight()) {
			int verticalSpaceLeft = candyContainerHeight - candyHeight;
			int newYLocation = candyContainerLocation.getY()+verticalSpaceLeft;
			this.setCandyHeight(this.getCandyHeight()+(new Candy().getHeight()));
			this.candyList.add(new Candy(this.getCandyContainerLocation().getX(), newYLocation));
//		} else {
//			System.out.println("Wonka says no!");
//		}
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
	@Visible(false)
	public int getCandyContainerHeight() {
		return this.candyContainerHeight;
	}
	public void setCandyContainerHeight(int candyContainerHeight) {
		this.candyContainerHeight = candyContainerHeight;
	}
	@Visible(false)
	public int getCandyContainerWidth() {
		return this.candyContainerWidth;
	}
	public void setCandyContainerWidth(int candyContainerWidth) {
		this.candyContainerWidth = candyContainerWidth;
	}
	@Visible(false)
	public int getCandyHeight() {
		return this.candyHeight;
	}
	public void setCandyHeight(int candyHeight) {
		this.candyHeight = candyHeight;
	}
	@Visible(false)
	public IPoint getCandyContainerLocation() {
		return this.candyContainerLocation;
	}
	public void setCandyContainerLocation(IPoint candyContainerLocation) {
		this.candyContainerLocation = candyContainerLocation;
	}
}
