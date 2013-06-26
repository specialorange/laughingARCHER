package nine;

public class WordToken extends Token implements IToken {
	
	private final String description = "Word";

	public WordToken(String substring) {
		// Not sure if I am to create the attributes or make setter methods to do so
		// if I do make setter methods, then how do you create the variables if they are supposed to be immutable
		//  do you create the variable in the setter method then return the variable like 'return this.variable'?
//		final String stringValue = substring.toLowerCase();
//		final String description = "Word";
		this.setStringValue(substring);
	}
	//StringValue
	public String getStringValue() {
		return super.getStringValue();
	}
	public void setStringValue(String str) {
		super.setStringValue(str.toLowerCase());
	}
	
	//Description
	public String getDescription() {
		return this.description;
	}
}
