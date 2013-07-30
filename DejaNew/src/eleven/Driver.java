package eleven;

import eleven.graphics.Neighborhood;
import eleven.graphics.INeighborhood;
import bus.uigen.ObjectEditor;

public class Driver {

	public static void main(String[] args) {
		INeighborhood neighborhood = new Neighborhood();
		ObjectEditor.edit(neighborhood);
		
		IParser parser = new Parser(args[0], neighborhood);
		System.out.println("PARSER CONCATENATION :>" + parser.getConcatenation());		
	}
}

// TODO
// The controller is also the 

//Dont remember the answer to this....
// In the observed class, is the method notifyListeners() private by omitting private?