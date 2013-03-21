package ass3;

import ass3.Stateless;
import ass3.Tokenizer;
import bus.uigen.ObjectEditor;

public class Driver {
	public static void main(String[] cheese) {
		if (cheese.length == 1) {
			//First part
			System.out.println(ass3.Stateless.tokensInArray(cheese[0])) ;  //run the main method in Stateless class
			//Second part
			Tokenizer token = new Tokenizer();
			token.setRawString(cheese[0]);
			ObjectEditor.edit(token.getProcessedString());
		} else {
			System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
		}
	}
	
}
