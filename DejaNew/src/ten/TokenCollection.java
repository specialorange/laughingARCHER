package ten;
import java.util.ArrayList;

import ten.graphics.Stack;

//How to make TokenCollection an ArrayList itself
public class TokenCollection extends Stack<ITokenCollection> implements ITokenCollection{

	private ArrayList<Token> tC;		

	public TokenCollection() {
		this.tC = new ArrayList<Token>();
	}
	
	public void addToken(Token token) {
		tC.add(token);
	}

	public void removeToken(int index) {
		tC.remove(index);
	}

	public Token getToken(int index){
		return tC.get(index);
	}
	
	public ArrayList<Token> getTC() {
		return this.tC;
	}
	public int size() {
		return this.tC.size();
	}
	public Token getLastToken() {
		return tC.get(tC.size()-1);
	}
	public String getLastTokenStringConcatenation() {
		return this.getLastToken().getDescription() + ": " + this.getLastToken().getStringValue() + " ";
	}
}
