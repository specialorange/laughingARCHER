package ass4;

public class NumberToken implements Token {

  public NumberToken(String substring) {
    private final String stringValue = substring.toLowerCase();
    private final String description = "Number";
    
    //StringValue
    public void setStringValue(String string) {
      stringValue = string;
    }
    public String getStringValue() {
      return this.stringValue;
    }

    //Description
    public String getDescription() {
      return this.description;
    }
  }
}
