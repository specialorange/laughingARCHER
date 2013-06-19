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
		IScanner scanner = new Scanner();
		scanner.setOriginalString(args[0]);
		System.out.println(scanner.getConcatenation());
		
		IChild child = new Child(25, 25);
		
		IHalloween house1 = new Halloween();
		house1.addHome();
		
		ObjectEditor.edit(child);
//		ObjectEditor.edit(cS);
	}
}

// I re-factored the graphics classes primarily through using the Interfaces, then checked through the Classes themselves.  

//Search projects for TODO for my questions