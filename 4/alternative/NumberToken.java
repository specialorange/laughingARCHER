package ass4;

public class NumberToken implements TokenInterface {

  private String stringValue;
  private String description = "Number";

  public NumberToken(String substring) {  
  }
  
  //StringValue
  public void setStringValue(String substring) {
    this.stringValue = substring.toLowerCase();
  }
  public String getStringValue() {
    return this.stringValue;
  }
  
  //Description
  public void setDescription(String string) {
    this.description = string;
  }
  public String getDescription() {
    return this.description;
  }

}
