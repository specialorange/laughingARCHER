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
