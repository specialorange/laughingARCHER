package ass3;
import ass3.Stateless;

public class Tokenizer {

	private String rawString;
	private String processedString;
	
	public void setRawString(String stringToBeStored) {
		this.rawString = stringToBeStored;
		this.processedString = Stateless.tokensInArray(stringToBeStored);
	}

	public String getProcessedString() {
		return this.processedString;
	}


}
