package nine.graphics;

import util.annotations.Visible;

public class Mailbox implements IMailbox {
	private IPoint location;
	private ILine post;
	private IRectangle box;
	private int height;
	private int width;
	private String text;
	
	public Mailbox() {
		this.setLocation(new Point(100,100));
		this.setBox(100, 100, 20, 20);
		this.setPost(110, 120, 0, 30);
		this.setHeight(40);
		this.setWidth(20);
	}
//	100, 100, 0, 30, 20, 20
	public Mailbox(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight) {
		this.setLocation(new Point(originX,originY));
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
	@Visible(false)
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint point) {	
		this.location = point;
	}
	@Visible(false)
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int newVal) {
		this.height = newVal;
	}
	@Visible(false)
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int newheight) {
		this.height = newheight;
	}
	@Visible(false)
	public String getText() {
		return this.text;
	}
	public void setText(String newVal) {
		this.text = newVal;
	}
}
