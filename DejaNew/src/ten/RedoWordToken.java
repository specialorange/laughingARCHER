package ten;

public class RedoWordToken extends WordToken implements IToken {

	private final String description = "redo";

	public RedoWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}
