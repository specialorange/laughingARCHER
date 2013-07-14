package eleven.graphics;

import java.util.ArrayList;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class CandyList extends Stack<IOval> implements ICandyList {
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
			this.addItem();
		}
	};
	
	public void changeLocationTo(int x, int y){
		this.setCandyContainerLocation(new Point(x,y));
		for (int i = 0 ; i < this.candyList.size() ; i++) {
			this.candyList.get(i).changeLocationTo(x, y);
		}
	}
	public void changeLocationBy(int x, int y){
		this.setCandyContainerLocation(new Point(this.getCandyContainerLocation().getX()+ x, this.getCandyContainerLocation().getY()+ y));
		for (int i = 0 ; i < this.candyList.size() ; i++) {
			this.candyList.get(i).changeLocationBy(x, y);
		}
	}
	@Override
	public void addItem(){
		int verticalSpaceLeft = candyContainerHeight - candyHeight;
		if (verticalSpaceLeft >= new Candy().getHeight()) {
			int newYLocation = candyContainerLocation.getY()+verticalSpaceLeft;			
			this.setCandyHeight(this.getCandyHeight()+(new Candy().getHeight()));
			super.addItem(new Candy(this.getCandyContainerLocation().getX(), newYLocation));
		}
	}	
	@Override
	public void removeLastItem(){
		this.setCandyHeight(this.getCandyHeight()-candyList.get(candyList.size()-1).getHeight());
		super.removeLastItem();
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
