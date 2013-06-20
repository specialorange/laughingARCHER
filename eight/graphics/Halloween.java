package eight.graphics;

import java.util.ArrayList;
import util.annotations.Visible;

public class Halloween implements IHalloween {

	private ArrayList<Home> neighborhood;
	
	public Halloween() {
		neighborhood = new ArrayList<Home>();
//		this.addHome();
	}

//	@Visible(false)
//	Same problem with not showing and it doesnt show the homes in the neighborhood
	public ArrayList<Home> getNeighborhood() {
		return this.neighborhood;
	}
	public void setNeighborhood(ArrayList<Home> neighborhood) {
		this.neighborhood = neighborhood;
	}
	public void addHome() {		
		neighborhood.add(new Home(350*neighborhood.size()));
	}
	public void moveChild(Home home, int x, int y) {
		home.getAvatar().changeLocation(x, y);
	}
	public void removeLastHome() {
		neighborhood.remove(neighborhood.size()-1);
	}
//	public IHome getHome() {
//		return this.home;
//	}
//	public void setHome(IHome home) {
//		this.home = home;
//	}		

}
