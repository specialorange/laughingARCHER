package wordProcessor;

public class MainClass {

  /**
   * @param args
   */
  public static void main (String[] cheese) {
    if (cheese.length == 1)
      printArray(wordsInArray(cheese));
        else
      System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
  }
  
  public static String[] wordsInArray (String[] args) {
    String[] words = null;   //I dont know how to declare an arraylist which causes problems at line 27
    Boolean prevBlank = false;
    int index = 0;
    String word = null;
    while ( index < args[0].length() ) {
      if ( prevBlank == false ) { //start of string or middle of word
        if ( Character.isLetter(index) ) {
          word += args[0].charAt(index); //add the index to the current word
          index++;
        } else { //char is blank
          prevBlank = true;
          words[words.length] = word;
          word = null; //reset word to blank
          index++;
        }
      } else { //previous char was a blank
        if ( Character.isLetter(index) ) { //starting  of a string/word
          prevBlank = false;
          //START NEW WORD
          index++;
        } else { //two or more blanks
          prevBlank = true;
          index++;
        }
      }
    }
    return reverseArray(words);   //Not sure if this is POssible, but I dont know how to call a function in Java.
  }

  public static String[] reverseArray (String[] args) {
    String[] reversedArray = new String[args.length];
    for (int i = 1; i < args.length + 1; i++) {
      reversedArray[i] = args[(args.length -i)];
    }
    return reversedArray;
  }

  public static void printArray (String[] args) {
    for ( int i=0 ; i <args.length ; i++ ) {
      System.out.println(args[i]);
    }
  }

}
