package seven;

public class MoveWordToken extends WordToken implements IToken{

	private final String description = "move";

	public MoveWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}
