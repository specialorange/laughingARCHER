package ass5;
public class Avatar implements IAvatar{

	private Oval circle;
	private Line post;
//	private Point location;
	
	public Avatar() {
		this.setCircle(new Oval());
		this.setPost(new Line(110, 120, 0, 30));
	}

	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
//		this.setLocation(new Point(originX, originY));
		this.setCircle(new Oval(originX, originY, circleWidth, circleHeight));
		this.setPost(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));

	}
//	public void setLocation(Point location) {
//		this.location = location;
//	}
//	public Point getLocation() {
//		return this.location;
//	}
	public void setLocation(int x, int y) {
	}
	public void changeLocation(int x, int y) {
		this.setCircle(new Oval(this.getCircle().getLocation().getX()+x, this.getCircle().getLocation().getY()+y, this.getCircle().getWidth(), this.getCircle().getHeight()));
		this.setPost(new Line(this.getPost().getLocation().getX()+x,  this.getPost().getLocation().getY()+y, this.getPost().getWidth(), this.getPost().getHeight()));
	}
	public void changeBadXLocation(int x, int y) {
		this.setCircle(new Oval(this.getCircle().getLocation().getX()+x, this.getCircle().getLocation().getY()+y, this.getCircle().getWidth(), this.getCircle().getHeight()));
		this.setPost(new Line(this.getPost().getLocation().getX()+x-30,  this.getPost().getLocation().getY()+y, this.getPost().getWidth(), this.getPost().getHeight()));
	}
	public void setCircle(Oval circle) {
		this.circle = circle;
	}
	public Oval getCircle() {
		return this.circle;
	}
	public Line getPost() {
		return this.post;
	}
	public void setPost(Line post) {
		this.post = post;
	}
}
