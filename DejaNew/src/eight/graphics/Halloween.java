package eight.graphics;

import java.util.ArrayList;

import util.annotations.Visible;

public class Halloween implements IHalloween {

	private ArrayList<Home> neighborhood;
	private IChild child;
	
	public Halloween() {
		neighborhood = new ArrayList<Home>();
		this.setChild(new Child(250,150,1,30,20,20));
	}

//	@Visible(false)
//	TODO
//	Awaiting Repsonse from Dewan
//	Same problem with not showing and it doesn't show the homes in the neighborhood
	public ArrayList<Home> getNeighborhood() {
		return this.neighborhood;
	}
	public void setNeighborhood(ArrayList<Home> neighborhood) {
		this.neighborhood = neighborhood;
	}
	public void addHome() {		
		neighborhood.add(new Home(350*neighborhood.size()));
	}
	public void moveChild(int x, int y) {
		child.changeLocation(x, y);
	}
	public void removeLastHome() {
		neighborhood.remove(neighborhood.size()-1);
	}
	public IAvatar getAvatar() {
		return this.child;
	}
	@Visible(false)
	public void setChild(IChild child) {
		this.child = child;
	}
}
