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

		neighborhood.isChildInWalkwayOfHouse(1);
		
		ObjectEditor.edit(neighborhood);
	}
}

// TODO

// It says in the assignment that:
//As the function takes an avatar as an argument, it does not define a property of a house.
//This means that I shouldn't have a boolean variable and set it, as it would "define" a property, right?
//So all he wants is the method?

//I have a problem in the CHild class where the avatar extends the Stick, but doesnt have access to its super methods
