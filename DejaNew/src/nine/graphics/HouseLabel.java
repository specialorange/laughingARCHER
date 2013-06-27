package nine.graphics;

import util.annotations.StructurePattern;

@StructurePattern("Label Pattern")
public class HouseLabel implements IHouseLabel {
    private int width, height;
    private String text, imageFile;
    private IPoint location;
    
    public HouseLabel (int x, int y) {		
		this.setImageFileName("../DejaNew/src/eight/graphics/house.jpeg");
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Point(x,y));
		this.setText("House");
     }
    public HouseLabel (String path) {		
		this.setImageFileName(path);
		this.setHeight(203);
		this.setWidth(203);
		this.setLocation(new Point(0,0));
		this.setText("House");
     }
    
     public IPoint getLocation() {return this.location;}
     public void setLocation(IPoint newVal) {this.location = newVal;}
     public int getWidth() { return this.width;}
     public void setWidth(int newVal) {this.width = newVal;}
     public int getHeight() {return this.height;}
     public void setHeight(int newHeight) {this.height = newHeight;}
     public String getText() {return this.text;}
     public void setText(String newVal) {this.text = newVal;}
     public String getImageFileName() {return this.imageFile;}
     public void setImageFileName(String newVal) {this.imageFile = newVal;} ;
}
