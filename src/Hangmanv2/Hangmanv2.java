package Hangmanv2;

import java.util.Scanner;

public class Hangmanv2 {

	static String word = Wordlist.getWord(); // connects this class to a getter in the Wordlist class.
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*"); // Grabs and hides the
																								// secret word in
																								// asterisks
	public static int counter = 0; // counter for the game
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("You can write either a single letter or a complete word."
				+ "\nYou have a total of 7 chances with letters.");
		System.out.println("However, you lose instantly if you write a word that is wrong.");
		System.out.println("Please pick an option" + "\n'1' to write a whole word." + "\n'2' to write a letter."
				+ "\n'3' to see how many errors you've made.");

		boolean stayalive = false; // boolean to help terminate the loop with entireWords()
		while (counter < 7 && asterisk.contains("*") && stayalive == false) { // game loop

			System.out.println(asterisk); // prints the hidden words in asterisk

			String Guess = input.next().toUpperCase();

			switch (Guess) { // the menu to choose between a word, char and the counter.
			  case "1": // if user enters this case, the game will end after a guess has been made
				entireWords();
				stayalive = true;
				break;
			  case "2":
				letters();
				break;
			  case "3":
				System.out.println("You've guessed wrong " + counter + " times");
				break;

			  default:
				System.out.println("Please enter an actual choice.");
			}

		}
		input.close();

	}

	public static void letters() { // method for Char guessing ( single letter guessing )
		String guess = input.next().toUpperCase();
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) { // correct guess
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') { // wrong guess
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) { // wrong guess, counter +1 and image is shown
			counter++;
			imageGetsHanged();
		} else {
			asterisk = newasterisk; // a single correct letter entered.
		}
		if (asterisk.equals(word)) { // correct letters were entered and wins the game
			System.out.println("Correct! The word was " + word);
		}
	}

	public static void entireWords() { // the entire word method, guess right = win, guess wrong = lose.
		String guessWord = input.next().toUpperCase();
		if (guessWord.equals(word)) {
			System.out.println("You win! The word was " + word);

		} else if (!guessWord.equals(word)) {

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

	public static void imageGetsHanged() { // shows the wrong guesses progress with images connected to the counter
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