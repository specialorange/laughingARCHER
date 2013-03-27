package ass5;

import ass5.SpecImage;

public class HouseClass implements HouseInterface {
	
	private SpecImage image;

	public HouseClass() {
		this.image = new SpecImage(10, 10);
	}
	
	public SpecImage getHouseImage() {
		return this.image;
	}


}
