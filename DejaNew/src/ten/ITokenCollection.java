package ten;

import java.util.ArrayList;

public interface ITokenCollection {
	
	public void addToken(Token token);

	public void removeToken(int index);

	public ArrayList<Token> getTC();

	public Token getToken(int i);

	public String getLastTokenStringConcatenation();

	public int size();
}
