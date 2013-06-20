package eight;

public class AnimateWordToken extends WordToken implements IToken {
	
	private final String description = "animate";

	public AnimateWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}
