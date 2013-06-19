package eight.graphics;

import java.util.ArrayList;

public class Halloween implements IHalloween {

	private ArrayList<Home> neighborhood;

	public Halloween() {
		this.neighborhood = new ArrayList<Home>();
	}
	
	public void addHome() {
		neighborhood.add(new Home());
	}
	public void moveChild(Home home, int x, int y) {
		home.getAvatar().changeLocation(x, y);
	}
	public void removeLastHome() {
		neighborhood.remove(neighborhood.size()-1);
	}		

}
