package seven;

public class GiveWordToken extends WordToken implements IToken {

	private final String description = "give";

	public GiveWordToken(String substring) {
		super(substring);
	}

	public String getDescription() {
		return this.description;
	}

}
