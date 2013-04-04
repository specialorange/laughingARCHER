package ass5;
import ass5.Line;
import ass5.Rectangle;

public class Mailbox {
	private Line post;
	private Rectangle box;
	
//	100, 100, 0, 30, 20, 20
	public Mailbox() {
		this.setBox(100, 100, 20, 20);
		this.setPost(110, 120, 0, 30);
	}

	public Mailbox(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight) {
		this.setBox(originX, originY, boxWidth, boxHeight);
		this.setPost(originX+(boxWidth/2), originY+boxHeight, lineWidth, lineHeight);
	}
	public Line getPost() {
		return this.post;
	}
	public void setPost(int x, int y, int width, int height) {
		this.post = new Line(x, y, width, height);
	}
	public Rectangle getBox() {
		return this.box;
	}
	public void setBox(int x, int y, int width, int height) {
		this.box = new Rectangle(x, y, width, height);
	}
}
