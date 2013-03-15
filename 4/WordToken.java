package ass4;

public class WordToken implements Token {
  
  public WordToken(String substring) {
    // Not sure if I am to create the attributes or make setter methods to do so
    // if I do make setter methods, then how do you create the variables if they are supposed to be immutable
    //  do you create the variable in the setter method then return the variable like 'return this.variable'?
    private final String stringValue = substring.toLowerCase();
    private final String description = "Word";

    //StringValue
    public String getStringValue() {
      return this.stringValue;
    }

    //Description
    public String getDescription() {
      return this.description;
    }
  }
}
