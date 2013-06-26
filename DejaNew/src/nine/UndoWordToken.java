package nine;

public class UndoWordToken extends WordToken implements IToken {

	private final String description = "undo";

	public UndoWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}