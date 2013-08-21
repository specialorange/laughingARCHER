package eleven;
import java.util.ArrayList;
import eleven.graphics.Stack;

//How to make TokenCollection an ArrayList itself
public class TokenCollection extends Stack<ITokenCollection> implements ITokenCollection{

	private ArrayList<IToken> tC;		

	public TokenCollection() {
		this.tC = new ArrayList<IToken>();
	}
	
	public void addToken(IToken token) {
		tC.add(token);
	}

	public void removeToken(int index) {
		tC.remove(index);
	}

	public IToken getToken(int index){
		return tC.get(index);
	}
	
	public ArrayList<IToken> getTC() {
		return this.tC;
	}
	public int size() {
		return this.tC.size();
	}
	public IToken getLastToken() {
		return tC.get(tC.size()-1);
	}
	public String getLastTokenStringConcatenation() {
		return this.getLastToken().getDescription() + ": " + this.getLastToken().getStringValue() + " ";
	}
}
