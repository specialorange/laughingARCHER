package nine.graphics;

public interface IMailbox {
	public IPoint getLocation(); 
	public void setLocation(IPoint point);
	public int getWidth();
	public void setWidth(int newVal);
	public int getHeight() ;
	public void setHeight(int newVal);
	public String getText();
	public void setText(String newVal);
}
