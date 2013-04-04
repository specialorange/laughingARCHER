package ass5;
import ass5.Location;

public interface ISpecificImage {
    public Location getLocation(); 
    public void setLocation(Location newVal);
    public int getWidth(); 
    public int getHeight() ;
    public String getImageFileName();
}
