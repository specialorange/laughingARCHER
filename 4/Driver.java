package ass4;

import ass4.Tokenizer;
import ass4.TokenizerInterface;
import bus.uigen.ObjectEditor;

public class Driver {
	public static void main(String[] cheese) {
		if (cheese.length == 1) {
			//Use the interface to declare its type
			//token is var name
			//new is constructor to instantiate
			//Tokenizer() is a class that with () calls a constructor on Tokenizer
			TokenizerInterface token = new Tokenizer();
			token.setOriginalString(cheese[0]);
			ObjectEditor.edit(token.getConcatenation());
			System.out.println(token.getConcatenation());
		} else {
			System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
		}
	}
	
}
