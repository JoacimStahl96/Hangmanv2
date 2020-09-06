package Hangmanv2;

public class Wordlist {
	
	private static String[] words = {"MUPP", "PEN", "PLAYGROUND", "BOTTLE", "MOUSE", "VARIABLE",
			"SCREEN", "CLOCK", "CRISPS", "EGG", "CHICKEN", "CHAIR",
			 "SUPERCALIFRAGILISTICEXPIALIDOCIUS" };
	
	
	private static String word = words[(int) (Math.random() * words.length)];


	public static String getWord() {
		return word;
	}


	public static void setWord(String word) {
		Wordlist.word = word;
	}

}