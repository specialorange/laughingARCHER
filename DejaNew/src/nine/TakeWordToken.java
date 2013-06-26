package nine;

import seven.graphics.Candy;

public class TakeWordToken extends WordToken implements IToken {

//	public void Take(int x, int y, Candy candy) {
//		candy.setLocation(new Point(candy.getLocation().getX() + x, candy.getLocation().getY() + y));
//	}
	private final String description = "take";
	
	public TakeWordToken(String substring) {
		super(substring);
	}
	
	public Candy take(Candy candy) {
//		take candy   From Candy list? or candy container?
		return candy;
	}

	public String getStringValue() {
		return null;
	}

	public String getDescription() {
		return this.description;
	}
}
