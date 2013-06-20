package seven;
import seven.graphics.CandyStick;
import seven.graphics.ICandyStick;
import bus.uigen.ObjectEditor;

public class Driver {

	public static void main(String[] args) {
		IScanner scanner = new Scanner();
		scanner.setOriginalString(args[0]);
		System.out.println(scanner.getConcatenation());
		
		ICandyStick cS = new CandyStick(25, 25);
		ObjectEditor.edit(cS);
	}
}

// I re-factored the graphics classes primarily through using the Interfaces, then checked through the Classes themselves.  

//Search projects for TODO for my questions