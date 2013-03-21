package ass4;

import ass4.Tokenizer;
import bus.uigen.ObjectEditor;

public class Driver {
	public static void main(String[] cheese) {
		if (cheese.length == 1) {
			//First part
			Tokenizer.tokensInArray(cheese[0]);
		} else {
			System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
		}
	}
	
}
