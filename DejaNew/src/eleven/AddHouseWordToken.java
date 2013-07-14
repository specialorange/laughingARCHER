package eleven;

public class AddHouseWordToken extends WordToken implements IToken {

	private final String description = "addhouse";

	public AddHouseWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}
