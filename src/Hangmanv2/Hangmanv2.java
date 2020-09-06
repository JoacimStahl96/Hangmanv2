package Hangmanv2;

import java.util.Scanner;

public class Hangmanv2 {
	 
	static String word = Wordlist.getWord();
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	public static int counter = 0;  
    
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("You can write either a single letter or a complete word. ");
	    System.out.println("However, you lose instantly if you write a word that is wrong. ");
		while (counter < 7 && asterisk.contains("*")) {
			
			
			System.out.println("You have 7 chances to succeed, number of fails "+counter);
			System.out.println("Guess any letter or word ");
			
			System.out.println(asterisk);
			String Guess = input.next().toUpperCase();
			
			
			
	        if(Guess.length() > 1) {
			entireWords();
			break;
			}else {
				hang(Guess);
			} 
			
			
		}
		input.close();
	}

	public static void hang(String guess) { // method for Char guessing
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) { // wrong guess, counter +1 and image is shown
			counter++;
			imageGetsHanged();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! The word was " + word);
		}
	}
	
	public static void entireWords() { // the entire word method, guess right = win, guess wrong = lose.
        
		if(!asterisk.equals(word)) {
			System.out.println(" You win! The word was " + word);
			
		}else {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /x x\\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("YOU'RE HANGED! The word was " + word);
			
		}
	
	} 

	public static void imageGetsHanged() { // shows the error progress 
		if (counter == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (counter == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (counter == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (counter == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /o o\\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (counter == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /o o\\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (counter == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /o o\\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (counter == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /x x\\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("YOU'RE HANGED! The word was " + word);
		}
	}
	
}