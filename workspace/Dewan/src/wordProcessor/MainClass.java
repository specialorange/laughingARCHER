package wordProcessor;

public class MainClass {

  public static void main (String[] cheese) {
    if (cheese.length == 1) {
      wordsInArray(cleanseFirstBlanks(cheese[0]));
    } else {
      System.out.println("Illegal no of arguments:" + cheese.length + ". Terminating program");
    }
  }
  
  public static void wordsInArray (String string) {
	  Boolean inAWord = false;
	  int index = string.length()-1;
	  int endMarker = 0;
	  while ( index >= 0 ) {
		  if (Character.isLetter(string.charAt(index))) { //letter
			  if (inAWord == true) { //in a current word
				  if (index == 0 ) {System.out.println(string.substring(index, endMarker));}
				  index--;
			  } else { //start the end
				  endMarker = index+1;
				  inAWord = true;
				  index--;				  
			  }
		  } else { //space
			  if (inAWord == true) { //no current word
				  System.out.println(string.substring(index+1, endMarker));
				  index--;
				  inAWord = false;
			  } else { //completed finding a word
				  index--;				  
			  }
		  }
	  }

	 /** 
     * MAW: Here's a big clue on this: you don't need to save off the words.
     *      Check prof's solution on slide 35 of the PPT. 
     *      Then consider: if you're printing in reverse, how can you approach the reading of the string differently?
     */

    // CSF
    // I am a little confused how to accomplish this without storing the words , i must being missing the simple way
    // 1: parse through args[0] in reverse, and store the end and start indices of each word
    //    then print the words?  This would involve storing these vars or pairs, and i dont think
    //    that is what you were asking for....
    // 2: parse through args[0] in normal order and print the last word, then increase the word count
    //    or some other higher scoped variable and call the function recursively
    // 3: reverse parse args[0] and find the 'first' (which is the last) char, temporarily store that index,
    //    then find the 'next' (which is the first of the word) char that precedes a space (if not the first char of 
    //    args[0]), and print that, and continue through the for or while parse block  
  }

public static String cleanseFirstBlanks(String cheese) {
    String cleansedString = null;
    for ( int i = 0 ; i<cheese.length() ; i++ ) {
    	if ( Character.isLetter(cheese.charAt(i)) ) { //current index is a letter
    			 cleansedString = cheese.substring(i, cheese.length());
    			 return cleansedString;
    	}
    }
    return "";
}

}

