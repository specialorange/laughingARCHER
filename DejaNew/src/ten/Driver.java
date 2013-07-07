package ten;
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
				
		IParser parser = new Parser(args[0]);
		System.out.println(parser.getConcatenation());

//		neighborhood.isChildInWalkwayOfHouse(1);
		
		ObjectEditor.edit(neighborhood);
	}
}

// TODO

//I am unsure of how to do RD, this is how i think I should have it set up
//Im lost on RD:
//  Tokens
//    ↳ Types
//      ↳ requirements
//
//  Scanner
//    ↳ should scan the input string
//    ↳ must know the syntax requirements of the tokens
//    ↳ should use RD to see if there is a syntax error
//
//
//  Parser extends Scanner
//    ↳ uses the super() constructor and methods to process using the Scanner methods
//    ↳ is passed the tokenCollection from the super constructor
//    ↳ creates a IHalloween neighborhood
//    ↳ executes the commands in the tokenCollection on neighborhood
