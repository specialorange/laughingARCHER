package eight.graphics;
public class Avatar implements IAvatar{

	private IOval circle;
	private ILine post;
	private IPoint location;
	
	public Avatar() {
		this.setCircle(new Oval());
		this.setPost(new Line(110, 120, 0, 30));
	}
	public Avatar(int x, int y) {
		this.setCircle(new Oval(x, y, 25, 25));
		this.setPost(new Line(x+(25/2), y+25, 1, 15));
	}
	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
		this.setLocation(new Point(originX, originY));
		this.setCircle(new Oval(originX, originY, circleWidth, circleHeight));
		this.setPost(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));
	}

	public void setLocation(int x, int y) {
	}
	public void changeLocation(int x, int y) {
		this.setCircle(new Oval(x, y, this.getCircle().getWidth(), this.getCircle().getHeight()));
		this.setPost(new Line(x, y, this.getPost().getWidth(), this.getPost().getHeight()));
	}
	public void setCircle(IOval circle) {
		this.circle = circle;
	}
	public IOval getCircle() {
		return this.circle;
	}
	public ILine getPost() {
		return this.post;
	}
	public void setPost(ILine post) {
		this.post = post;
	}
	public IPoint getLocation() {
		return this.location;
	}
	public void setLocation(IPoint location) {
		this.location = location;
	}
}
