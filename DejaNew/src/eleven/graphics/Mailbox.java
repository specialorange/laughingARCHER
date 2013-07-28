package eleven.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Bean Pattern")
public class Mailbox extends Stick implements IMailbox {
	private IRectangle box;
	
	public Mailbox() {
		super(100,100,20,20);
		this.setBox(new Rectangle(100, 100, 20, 20));
	}
//	100, 100, 0, 30, 20, 20
	public Mailbox(int originX, int originY, int lineWidth, int lineHeight, int boxWidth, int  boxHeight) {
		super(originX, originY, lineWidth, lineHeight);
//		super.setLocation(new Point(originX,originY));
//		super.setBottom( new Line(originX+(boxWidth/2), originY+boxHeight, lineWidth, lineHeight));
		this.setBox(new Rectangle( originX, originY, boxWidth, boxHeight));
	}
	
	public void changeLocationTo(int x, int y) {
		this.getLocation().changeLocationTo(x, y);
		this.getBox().changeLocationTo(x, y);
		this.getBottom().changeLocationTo(x, y);		
	}
	@Override
	public void changeLocationBy(int x, int y) {
		this.getLocation().changeLocationTo(x, y);
		this.getBox().changeLocationTo(x, y);
		this.getBottom().changeLocationTo(x, y);		
	}
	public IRectangle getBox() {
		return this.box;
	}
	public void setBox(IRectangle rectangle) {
		this.box = rectangle;
	}
}