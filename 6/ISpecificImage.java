package ass6;
import ass5.Point;

public interface ISpecificImage {
    public Point getLocation(); 
    public void setLocation(Point newVal);
    public int getWidth(); 
    public int getHeight() ;
    public String getImageFileName();
}
