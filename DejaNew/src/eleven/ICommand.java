package eleven;

public interface ICommand {

	IToken getCurrentToken();
	IToken getPrevNum1();
	IToken getPrevNum2();
	public IToken getOppositeToken();
}
