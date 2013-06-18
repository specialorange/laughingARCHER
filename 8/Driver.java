package eight;
import eight.graphics.Child;
import eight.graphics.Home;
import eight.graphics.IChild;
import eight.graphics.IHome;
import bus.uigen.ObjectEditor;

public class Driver {

	public static void main(String[] args) {
		IScanner scanner = new Scanner();
		scanner.setOriginalString(args[0]);
		System.out.println(scanner.getConcatenation());
		
		IChild child = new Child(25, 25);
		
		IHome home = new Home();
		
		ObjectEditor.edit(home);
//		ObjectEditor.edit(cS);
	}
}

// I re-factored the graphics classes primarily through using the Interfaces, then checked through the Classes themselves.  

//Search projects for TODO for my questions