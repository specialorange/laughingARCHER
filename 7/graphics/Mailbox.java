package seven.graphics;

public class Mailbox implements IMailbox {
	private static IPoint Point = new Point();
	private ILine post;
	private IRectangle box;
	
//	100, 100, 0, 30, 20, 20
	public Mailbox() {
		this.setBox(100, 100, 20, 20);
		this.setPost(110, 120, 0, 30);
	}

	public Mailbox(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight) {
		this.setBox(originX, originY, boxWidth, boxHeight);
		this.setPost(originX+(boxWidth/2), originY+boxHeight, lineWidth, lineHeight);
	}
	public ILine getPost() {
		return this.post;
	}
	public void setPost(int x, int y, int width, int height) {
		this.post = new Line(x, y, width, height);
	}
	public IRectangle getBox() {
		return this.box;
	}
	public void setBox(int x, int y, int width, int height) {
		this.box = new Rectangle(x, y, width, height);
	}

	public String getImageFileName() {
		return null;
	}
	public void setImageFileName(String newVal) {
	}
	public IPoint getLocation() {
		return this.Point;
	}
	public void setLocation(Point point) {		
	}
	public int getWidth() {
		return 0;
	}
	public void setWidth(int newVal) {
	}
	public int getHeight() {
		return 0;
	}
	public void setHeight(int newVal) {
	}
	public String getText() {
		return null;
	}
	public void setText(String newVal) {
	}
}
