/**
 * @author Marloun_Bayari
 * @date completed 02/06/2019
 * @Project: Lesson 8 - Rock Paper Scissors with exceptions
 * @Guidelines - 	The method that accepts input from the user should throw an exception if the user enters invalid input.
 * 					The calling method should use a try/catch block to handle the bad input and print a nice message to the user.
 *
 */

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissorsException {

	/**
	 * @param args
	 */
	public static String player; // publicly accessible variable that is initiated out outside of try but need to be passed on in proceeding method
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		boolean shouldContinue = true;
		
		while (shouldContinue) {
			try {
				System.out.println("Let's play a game... Jan-Ken-Po!!");
				System.out.println("Type in (choices); rock, paper, scissors");
			
				player = reader.nextLine(); // User defined choice
				checkUserInput(player);
				shouldContinue = false;
			} catch (Exception e) {
				System.out.println("You need to pick and accepted choice");
			}			
		}
		String random = computerselect(); // Computer defined random choice
		play(player, random);
		reader.close();
	}
	
	/**s per requirements of assignment, this checks to see if the user input meets the criteria for a valid play
	 * 
	 * @param input
	 */
	public static void checkUserInput(String input) {
		if (!(input.equals("rock") || !(input.equals("paper") || !(input.equals("scissors"))))){
			throw new IllegalArgumentException();			
		}		
	}
	
	// Method to return a random play for the computer
	public static String computerselect() {
		String[] playchoices = {"rock", "paper", "scissosrs"};
		int idx = new Random().nextInt(playchoices.length); // random number generator from the size of array, three element to choose from, so this will choose randomly a number from 1,2,3
		System.out.println("Computer Selects: " + playchoices[idx]);
		return playchoices[idx]; // returns to main	method a random array variable, as chosen by random generator
	}
	
	/** Method to take in the choices of two player variables
	 * 
	 * @param personPlay
	 * @param computerPlay
	 * 
	 * This method was designed so that regardless if it's a 1 person game
	 * or even a two person game (wherein the computer picks both player hands)
	 * that this method will determine who wins between the two chosen plays.
	 * Standard rules apply
	 */
	public static void play(String personPlay, String computerPlay) {
		if (personPlay.equals(computerPlay)) {
				System.out.println("No one Wins. It's a tie!!");
		}
		else if (personPlay.equals("rock")) {
			if (computerPlay.equals("scissors")) {
				System.out.println("rock crushes scissors, you win!");
			}
			else if (computerPlay.equals("paper")) {
				System.out.println("paper covers rock, You Lose!!");
			}
		}
		else if (personPlay.equals("paper")) {
			if (computerPlay.equals("scissors")) {
				System.out.println("scissors cut paper, You Lose!!");
			}
			else if (computerPlay.equals("rock")) {
				System.out.println("paper covers rock, You Win!!");
			}
		}
		else if (personPlay.equals("scissors")) {
			if (computerPlay.equals("paper")) {
				System.out.println("scissors cut paper, You Win!!");
			}
			else if (computerPlay.equals("rock")) {
				System.out.println("rock Crushes scissors, You Lose!!");
			}
		}
				
}
}
