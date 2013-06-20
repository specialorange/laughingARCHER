package seven.graphics;

public interface ILabel {
    public IPoint getLocation();
    public void setLocation(Point newVal);
    public int getWidth();
    public void setWidth(int newVal);
    public int getHeight() ;
    public void setHeight(int newHeight);
    public String getText();
    public void setText(String newString);
    public String getImageFileName();
    public void setImageFileName(
        String newVal);
}
