package eight;
import eight.graphics.Child;
import eight.graphics.Halloween;
import eight.graphics.Home;
import eight.graphics.IChild;
import eight.graphics.IHalloween;
import eight.graphics.IHome;
import bus.uigen.ObjectEditor;

public class Driver {

	public static void main(String[] args) {
		IHalloween neighborhood = new Halloween();
		neighborhood.addHome();

//		IScanner scanner = new Scanner();
//		scanner.setOriginalString(args[0]);
//		System.out.println(scanner.getConcatenation());
				
		IParser parser = new Parser(neighborhood);
		parser.setOriginalString(args[0]);
		System.out.println(parser.getConcatenation());

		
		ObjectEditor.edit(neighborhood);
	}
}

// TODO

//fix parser to handle out of bounds issue with mv command