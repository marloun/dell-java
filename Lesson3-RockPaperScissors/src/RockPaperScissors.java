import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's play a game... Jan-Ken-Po!!");
		System.out.println("Type in (choose) rock, paper, scissors");
		
		Scanner reader = new Scanner(System.in);
		String Player1 = reader.nextLine();
		System.out.println("Human picks " + Player1);
		String Playerconvert = Player1.toLowerCase();
		//System.out.println(Playerconvert);		
		
		if (Playerconvert.equals("rock") || Playerconvert.equals("paper") || Playerconvert.equals("scissors")) {
			
			String[] rps = {"rock","paper","scissors"};	
			int idx = new Random().nextInt(rps.length);
			String random = (rps[idx]);		
			System.out.println("Computer picks " + random);
			play(Playerconvert, random);
			} else {
			System.out.println(Player1 + " is not a valid choice!");
			};
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
