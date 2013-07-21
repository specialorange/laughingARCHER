package eleven;

import eleven.graphics.Neighborhood;
import eleven.graphics.INeighborhood;
import bus.uigen.ObjectEditor;

public class Driver {

	public static void main(String[] args) {
		INeighborhood neighborhood = new Neighborhood();
						
		IParser parser = new Parser(args[0]);
		System.out.println(parser.getConcatenation());
		
		ObjectEditor.edit(neighborhood);
	}
}

// TODO
// In Point COntroller, how does the home know its index within the stack? 
//		 is this possible without making a local variable in the Home? as this would have a lot more methods trying to keep up with it...

//Dont remember the answer to this....
// In the observed class, is the method notifyListeners() private by omitting private?