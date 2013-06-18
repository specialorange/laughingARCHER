package eight.graphics;

import java.util.ArrayList;

public class Halloween implements IHalloween {

	private ArrayList<House> houseCollection;

	public void addHouse() {
		houseCollection.add(new House());
	}

	public void moveChild(int x, int y) {
		
	}

	public void removeLastHouse() {
		houseCollection.remove(houseCollection.size()-1);
	}		

}
