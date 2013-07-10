package ten.graphics;

import java.util.ArrayList;

import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Neighborhood extends Stack<INeighborhood> implements INeighborhood {

	private IChild child;
	private boolean hasChildOnAWalkway;
	
	public Neighborhood() {
//		 TODO why wont it let me create the array list of type Homes,   It wants me to change the method in Stack
//		or the type Home to T in the constructor
		super.setArrayList( new ArrayList<Home>());
		this.setChild(new Child(250,150,1,30,20,20));
	}

	public boolean isChildInWalkwayOfHome(int number){
		return super.getArrayList().get(number).isTrespassing(this.child);
//		TODO
//		the above method doesn't work, and Eclipse wants me to create it in the neighborhood class (this one).   but
//		I explicitly made sure that the method is in the Interface for IHome, which is what the Stack ArrayList<Home> 
//		should be made of.
	}
//	@Visible(false)
//	TODO
//	Awaiting Response from Dewan
//	Same problem with not showing and it doesn't show the homes in the neighborhood
	
	
	public void moveChildBy(int x, int y) {
		child.changeLocationBy(x, y);
		child.checkIfInWalkway(super.getArrayList());
	}
	public void moveChildTo(int x, int y) {
		child.changeLocationTo(x, y);
		child.checkIfInWalkway(super.getArrayList());
	}
	public IChild getPerson() {
		return this.child;
	}
	@Visible(false)
	public void setChild(IChild child) {
		this.child = child;
	}
	public boolean getHasChildOnWalkway() {
		return this.hasChildOnAWalkway;
	}
	public void setHasChildOnWalkway(boolean value) {
		this.hasChildOnAWalkway = value;
	}
}
