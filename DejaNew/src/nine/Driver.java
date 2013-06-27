package nine;
import nine.graphics.Halloween;
import nine.graphics.IHalloween;
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

//How to handle the passing of the neighborhood object to the child, so the child can check if it is in the walkway? 
