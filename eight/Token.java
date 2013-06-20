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
}
