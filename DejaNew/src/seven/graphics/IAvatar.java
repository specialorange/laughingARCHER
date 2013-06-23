package seven.graphics;

public interface IAvatar {
	public IOval getCircle();
	public void setCircle(Oval circle);
	public ILine getPost();
	public void setPost(Line post);
	public void changeLocation(int x, int y);
}
