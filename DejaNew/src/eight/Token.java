package eight;

public class Token implements IToken {

	private String stringValue;
	
	public String getStringValue() {
		return this.stringValue;
	}
	public String getDescription() {
		return null;
	}
	public void setStringValue(String str) {
		this.stringValue = str;
	}
	public String toString() {
		return this.stringValue;
	}
//	public int toInt() {
////		TODO
////		I am unsure of how to do error checking to ensure that it can be converted to an Int
////		if((Integer.parseInt(this.stringValue)) instanceof Integer.parseInt() ) {
//			return Integer.parseInt(this.stringValue);
////		} else {
////			return null;
////		}
//	}
}
