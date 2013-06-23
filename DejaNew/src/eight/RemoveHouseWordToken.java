package eight;

public class RemoveHouseWordToken extends WordToken implements IToken {

	private final String description = "removehouse";

	public RemoveHouseWordToken(String substring) {
		super(substring);
	}
	public String getDescription() {
		return this.description;
	}

}
