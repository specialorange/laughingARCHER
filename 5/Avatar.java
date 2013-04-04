package ass5;

public class Avatar implements IAvatar{

	private Location location;
	private Oval circle;
	private Line post;
	
	public Avatar() {
		this.setLocation(new Location(100, 100));
		this.setCircle(new Oval());
		this.setPost(new Line(110, 120, 0, 30));
	}

	public Avatar(int originX, int originY, int postWidth, int postHeight, int circleWidth, int circleHeight) {
		this.setLocation(new Location(originX, originY));
		this.setCircle(new Oval(originX, originY, circleWidth, circleHeight));
		this.setPost(new Line(originX+(circleWidth/2), originY+circleHeight, postWidth, postHeight));

	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location point) {
		this.location = point;
	}
	public Oval setCircle(Oval circle) {
		return this.circle;
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
