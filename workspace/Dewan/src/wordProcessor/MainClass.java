package wordProcessor;

import java.util.ArrayList;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] cheese) {
		if (cheese.length == 1)	
			printArray(wordsInArray(cheese[0]));
		else
			System.out.println("Illegal no of arguments:" + cheese.length
					+ ". Terminating program");
	}

	public static ArrayList<String> wordsInArray(String args) {
		ArrayList<String> words = new ArrayList<String>();
		System.out.println(args);
		Boolean prevBlank = false;
		int index = 0;
		String word = null;
		while (index < args.length()) {
			if (prevBlank == false) { // start of string or middle of word
				if (Character.isLetter(index)) {
					word += args.charAt(index); // add the index to the
													// current word
					index++;
				} else { // char is blank
					prevBlank = true;
					words.add(word);
					word = null; // reset word to blank
					index++;
				}
			} else { // previous char was a blank
				if (Character.isLetter(index)) { // starting of a string/word
					prevBlank = false;
					// START NEW WORD
					index++;
				} else { // two or more blanks
					prevBlank = true;
					index++;
				}
			}
		}
		System.out.println(words);
		return reverseArray(words);
	}

	public static ArrayList<String> reverseArray(ArrayList<String> words) {
		ArrayList<String> reversedArray = new ArrayList<String>();
		for (int i = 1; i < words.size() + 1; i++) {
			reversedArray.add(words.get((words.size() - i)));
		}
		return reversedArray;
	}

	public static void printArray(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
