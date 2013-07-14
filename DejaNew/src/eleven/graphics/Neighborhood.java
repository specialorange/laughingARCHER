package eleven.graphics;

import java.util.ArrayList;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern")
public class Neighborhood extends Stack<IHome> implements INeighborhood {

	private IChild child;
	private boolean hasChildOnAWalkway;
	
	public Neighborhood() {
//	TODO why wont it let me create the array list of type Homes,   It wants me to change the method in Stack
//	or the type Home to T in the constructor
		setArrayList(new ArrayList<IHome>());
		this.setChild(new Child(250,150,1,30,20,20));
	}

	public boolean isChildInWalkwayOfHome(int number){
		return super.getArrayList().get(number).isChildTrespassing(this.child);
	}
//	@Visible(false)
//	TODO
//	Awaiting Response from Dewan
//	Same problem with not showing and it doesn't show the homes in the neighborhood
	
	
	public void moveChildBy(int x, int y) {
		child.changeLocationBy(x, y);
		for (int i = 0 ; i < super.getArrayList().size()-1 ; i++) {
			if(this.isChildInWalkwayOfHome(i)) {
				this.child.connectToHome(i);
			}
		}
	}
	public void moveChildTo(int x, int y) {
		child.changeLocationTo(x, y);
		for (int i = 0 ; i < super.getArrayList().size()-1 ; i++) {
			if(this.isChildInWalkwayOfHome(i)) {
				this.child.connectToHome(i);
			}
		}
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
	public void fromHomeToChild(){
		
	};
	public void fromChildToHome(){};
}
