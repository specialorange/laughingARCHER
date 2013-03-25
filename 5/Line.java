package ass5;

public class Line implements LineInterface{

	private int x;
	private int y; 
	private int width;
	private int height;
	
	public Line () {
		
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int newY) {
		this.y = newY;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int newWidth) {
		this.width = newWidth;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
}
