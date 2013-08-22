package eleven;

public class Command implements ICommand {

	private IToken currentToken;
	private IToken prevNum1;
	private IToken prevNum2;
	private IToken oppositeToken;
	private IToken oppositeNum1;
	private IToken oppositeNum2;
	private	Command oppositeCommand;
	
	public Command(IToken nextToken) {
		setPrevToken(nextToken);
		if (nextToken instanceof AddHouseWordToken) {
			setOppositeToken(new RemoveHouseWordToken("rm"));
		} else if (nextToken instanceof RemoveHouseWordToken) {
			setOppositeToken(new AddHouseWordToken("ah"));
		} else if (nextToken instanceof AnimateWordToken) {
			setOppositeToken(new AnimateWordToken("am"));
		}
	}
	public Command(IToken token, IToken num1, IToken num2) {
		System.out.println(token);
		System.out.println(num1);
		System.out.println(num2);
		setPrevToken(token);
		setOppositeToken(token);
		setPrevNum1(num1);
		setPrevNum2(num2);
		setOppositeNum1( new NumberToken( Integer.toString( (((NumberToken) num1 ).getOppositeNumber()))) );
		setOppositeNum2( new NumberToken( Integer.toString( (((NumberToken) num2 ).getOppositeNumber()))) );
		setOppositeCommand(new Command(getOppositeToken(), getOppositeNum1(), getOppositeNum2(), true));
	}
// Opposite Token without an opposite
	public Command(IToken token, IToken num1, IToken num2, boolean opposite) {
		setPrevToken(token);
		setPrevNum1(num1);
		setPrevNum2(num2);
	}
	public IToken getOppositeNum1() {
		return this.oppositeNum1;
	}
	public void setOppositeNum1(IToken int1) {
		this.oppositeNum1 = int1;
	}
	public IToken getOppositeNum2() {
		return this.oppositeNum2;
	}
	public void setOppositeNum2(IToken int2) {
		this.oppositeNum2 = int2;
	}
	public IToken getCurrentToken() {
		return this.currentToken;
	}
	public void setPrevToken(IToken nextToken) {
		this.currentToken = nextToken;
	}
	public IToken getOppositeToken() {
		return this.oppositeToken;
	}
	public void setOppositeToken(IToken token) {
		this.oppositeToken = token;
	}
	public IToken getPrevNum2() {
		return prevNum2;
	}
	public void setPrevNum2(IToken prevNum2) {
		this.prevNum2 = prevNum2;
	}
	public IToken getPrevNum1() {
		return prevNum1;
	}
	public void setPrevNum1(IToken prevNum1) {
		this.prevNum1 = prevNum1;
	}
	public Command getOppositeCommand() {
		return oppositeCommand;
	}
	public void setOppositeCommand(Command oppositeCommand) {
		this.oppositeCommand = oppositeCommand;
	}
}
