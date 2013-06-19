package eight.graphics;

import java.util.ArrayList;

public class Halloween implements IHalloween {

	private ArrayList<Home> neighborhood;
	private IHome home;
	
	public Halloween() {
		this.setHome(new Home());
		neighborhood = new ArrayList<Home>();
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
	public IHome getHome() {
		return this.home;
	}
	public void setHome(IHome home) {
		this.home = home;
	}		

}
