package ass5;

public class Label {
    private int width, height;
    private String text, imageFile;
    private Location point;
    
    public Label () {		
		this.setImageFileName("../Dewan/src/ass5/house.jpeg");
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Location(0,0));
		this.setText("House");
     }
    public Label (String path) {		
		this.setImageFileName(path);
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Location(0,0));
		this.setText("House");
     }
    
     public Location getLocation() {return this.point;}
     public void setLocation(Location newVal) {this.point = newVal;}
     public int getWidth() { return this.width;}
     public void setWidth(int newVal) {this.width = newVal;}
     public int getHeight() {return this.height;}
     public void setHeight(int newHeight) {this.height = newHeight;}
     public String getText() {return this.text;}
     public void setText(String newVal) {this.text = newVal;}
     public String getImageFileName() {return this.imageFile;}
     public void setImageFileName(String newVal) {this.imageFile = newVal;} ;
}
