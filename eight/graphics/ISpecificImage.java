package eight.graphics;

public interface ISpecificImage {
    public IPoint getLocation(); 
    public void setLocation(IPoint newVal);
    public int getWidth(); 
    public int getHeight() ;
    public String getImageFileName();
}
