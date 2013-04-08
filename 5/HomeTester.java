package ass5;
import ass5.Avatar;

public class HomeTester {
	private int unitCircleX;
	private int unitCircleY;
	private int unitPostX;
	private int unitPostY;
	private int baseCircleX;
	private int baseCircleY;
	private int basePostX;
	private int basePostY;
	
	public void test (Avatar unit) {
		this.setUnitCircleX(unit.getCircle().getLocation().getX());
		this.setUnitCircleY(unit.getCircle().getLocation().getY());
		this.setUnitPostX(unit.getPost().getLocation().getX());
		this.setUnitPostY(unit.getPost().getLocation().getY());
		Avatar baseAvatar = new Avatar();
		this.compareAvatars(unit, baseAvatar);
	}
	public void compareAvatars(Avatar one, Avatar two) {
//		if 
	}
	
	public int getUnitCircleX() {
		return this.unitCircleX;
	}
	public void setUnitCircleX(int circleX) {
		this.unitCircleX = circleX;
	}
	public int getUnitCircleY() {
		return this.unitCircleY;
	}
	public void setUnitCircleY(int circleY) {
		this.unitCircleY = circleY;
	}
	public int getUnitPostX() {
		return this.unitPostX;
	}
	public void setUnitPostX(int postX) {
		this.unitPostX = postX;
	}
	public int getUnitPostY() {
		return this.unitPostY;
	}
	public void setUnitPostY(int postY) {
		this.unitPostY = postY;
	}
	public int getBaseCircleX() {
		return this.baseCircleX;
	}
	public void setBaseCircleX(int baseCircleX) {
		this.baseCircleX = baseCircleX;
	}
	public int getBaseCircleY() {
		return this.baseCircleY;
	}
	public void setBaseCircleY(int baseCircleY) {
		this.baseCircleY = baseCircleY;
	}
	public int getBasePostX() {
		return this.basePostX;
	}
	public void setBasePostX(int basePostX) {
		this.basePostX = basePostX;
	}
	public int getBasePostY() {
		return this.basePostY;
	}
	public void setBasePostY(int basePostY) {
		this.basePostY = basePostY;
	}
}
