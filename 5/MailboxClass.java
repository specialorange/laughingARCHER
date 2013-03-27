package ass5;
import ass5.Line;
import ass5.Rectangle;

public class MailboxClass {
	private Line post;
	private Rectangle box;
	
	public MailboxClass(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight) {
		this.setPost(originX+(lineWidth/2), originY+lineHeight, lineWidth, lineHeight);
		this.setBox(originX, originY, boxWidth, boxHeight);
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
