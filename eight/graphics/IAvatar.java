package eight.graphics;

public interface IAvatar {
	public IOval getCircle();
	public void setCircle(IOval circle);
	public ILine getPost();
	public void setPost(ILine post);
	public void changeLocation(int x, int y);
}
