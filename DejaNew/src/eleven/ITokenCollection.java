package eleven;

import java.util.ArrayList;

public interface ITokenCollection {
	
	public void addToken(IToken token);

	public void removeToken(int index);

	public ArrayList<IToken> getTC();

	public IToken getToken(int i);

	public String getLastTokenStringConcatenation();

	public int size();
}
