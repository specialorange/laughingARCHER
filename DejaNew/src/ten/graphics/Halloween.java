package ten.graphics;

import java.util.ArrayList;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Halloween implements IHalloween {

	private ArrayList<Home> neighborhood;
	private IChild child;
	
	public Halloween() {
		neighborhood = new ArrayList<Home>();
		this.setChild(new Child(250,150,1,30,20,20));
	}

	public boolean isChildInWalkwayOfHouse(int number){
		return this.neighborhood.get(number).isTresspassing(this.child);
	}
//	@Visible(false)
//	TODO
//	Awaiting Response from Dewan
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
	public void moveChildBy(int x, int y) {
		child.changeLocationBy(x, y);
		child.checkIfInWalkway(this.neighborhood);
	}
	public void moveChildTo(int x, int y) {
		child.changeLocationTo(x, y);
		child.checkIfInWalkway(this.neighborhood);
	}
	public void removeLastHome() {
		neighborhood.remove(neighborhood.size()-1);
	}
	public IChild getPerson() {
		return this.child;
	}
	@Visible(false)
	public void setChild(IChild child) {
		this.child = child;
	}
}
