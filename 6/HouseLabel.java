package ass6;

public class HouseLabel implements IHouseLabel {
    private int width, height;
    private String text, imageFile;
    private Point point;
    
    public HouseLabel () {		
		this.setImageFileName("../Dewan/src/ass5/house.jpeg");
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Point(0,0));
		this.setText("House");
     }
    public HouseLabel (String path) {		
		this.setImageFileName(path);
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Point(0,0));
		this.setText("House");
     }
    
     public Point getLocation() {return this.point;}
     public void setLocation(Point newVal) {this.point = newVal;}
     public int getWidth() { return this.width;}
     public void setWidth(int newVal) {this.width = newVal;}
     public int getHeight() {return this.height;}
     public void setHeight(int newHeight) {this.height = newHeight;}
     public String getText() {return this.text;}
     public void setText(String newVal) {this.text = newVal;}
     public String getImageFileName() {return this.imageFile;}
     public void setImageFileName(String newVal) {this.imageFile = newVal;} ;
}
