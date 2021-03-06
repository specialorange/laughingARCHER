package ass4;

public class NumberToken implements TokenInterface {

	private String stringValue;
	private final String description = "Number";

	public NumberToken(String substring) {	
		this.setStringValue(substring);
	}
	
	//StringValue
	public void setStringValue(String substring) {
		this.stringValue = substring.toLowerCase();
	}
	public String getStringValue() {
		return this.stringValue;
	}
	
	//Description
	public String getDescription() {
		return this.description;
	}

}

