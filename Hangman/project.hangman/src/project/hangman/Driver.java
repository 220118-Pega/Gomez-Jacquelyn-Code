package project.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		try (// use scanner to read console to get user input via console
				//needs an input stream
				// Use scanner to read console to get user input via console
			Scanner myScanner = new Scanner(System.in)) {
				//every time you guess wrong, a body part is added to the noose (decrement the body part)
				int bodyParts = 6; 
			
				// asks user for input - mystery word
				System.out.println("Enter word to be guessed: ");
				//gets user input
				String mysteryWord = myScanner.nextLine();
				List<String> correctlyGuessedLetters = new ArrayList<String>();
				String originalWord = mysteryWord;
			
				while(bodyParts > 0) {
					//guessing part of the game
					//ask player what letter they think is in the string
					System.out.println("Guess a letter: ");
					//get user's input for guessed letter
					String guessedLetter = myScanner.nextLine();
					//to print current guessed state since we're removing letters
				
					//if else block to specify if a player correctly guessed a letter in the word
					if(mysteryWord.contains(guessedLetter)) {
						System.out.println(mysteryWord.contains(guessedLetter));
						System.out.println("The word contains " + guessedLetter);
						//"remove" all correctly guessed letters
						mysteryWord = mysteryWord.replaceAll(guessedLetter, "");
						correctlyGuessedLetters.add(guessedLetter);
					
					} else {
						System.out.println("The word does not contain " + guessedLetter);
						//decrement the bodyParts (add a body part to the noose)
						bodyParts --;
					}
					System.out.println("How the guessing is going: ");
					//pring current state of my code
					//use the wrapper class Character instead of char primitive so we can make use of the toString method
					for (Character letter:originalWord.toCharArray()) {
						if (correctlyGuessedLetters.contains(letter.toString())) 
						{
							System.out.print(letter);
						} else {
							System.out.print("#");
						}
					}
					System.out.println();
					if (mysteryWord.length() == 0) {
						System.out.println("You guessed all the letters in the word!");
						break;
					}
				
				}
			
				if (bodyParts == 0) {
					//if you run out of chances
					System.out.println("Better luck next time");
				}
			
				}
			
		}
		
	}

