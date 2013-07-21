package eleven;

public interface IScanner {
	public ITokenCollection setAndProcess(String input, ITokenCollection tC);
	public String getConcatenation();
}
