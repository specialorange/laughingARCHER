package eight.graphics;

public interface IHouseLabel {

	public String getImageFileName();
	public void setImageFileName(String newVal);
	public IPoint getLocation(); 
	public void setLocation(Point newVal);
	public int getWidth();
	public void setWidth(int newVal);
	public int getHeight() ;
	public void setHeight(int newVal);
	public String getText();
	public void setText(String newVal);
}
