/**
 * @author Marloun_Bayari
 * @date completed 02/06/2019
 * @Project: Lesson 8 - Rock Paper Scissors with excpetions
 *
 */

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissorsException {

	/**
	 * @param args
	 */
	public static String player;
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		boolean shouldContinue = true;
		
		while (shouldContinue) {
			try {
				System.out.println("Let's play a game... Jan-Ken-Po!!");
				System.out.println("Type in (choices); rock, paper, scissors");
			
				player = reader.nextLine();
				checkUserInput(player);
				shouldContinue = false;
			} catch (Exception e) {
				System.out.println("You need to pick and accepted choice");
			}			
		}
		String random = computerselect();
		play(player, random);
		reader.close();
	}
	
	public static void checkUserInput(String input) {
		if (!(input.equals("rock") || !(input.equals("paper") || !(input.equals("scissors"))))){
			throw new IllegalArgumentException();
			
		}
		
	}

	public static String computerselect() {
		String[] playchoices = {"rock", "paper", "scissosrs"};
		int idx = new Random().nextInt(playchoices.length);
		System.out.println("Computer Selects: " + playchoices[idx]);
		return playchoices[idx];
		
	}
	
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
