import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static char[][] board = new char [3][3];
	public static String Player = new String("");
	public static char Mark = '\0';
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10; i++) {
			System.out.println("main start");
		printBoard();
		switchPlayer(Player);
		playerSelect(Player, Mark);	
		System.out.println("main Player Select complete");
		checkForWin(Mark);
		};

	}
	
	//checks to see who the current player is, then switches it (and the Player Mark appropriately)
	public static void switchPlayer(String currentPlayer) {
		switch (currentPlayer) {
		case "": // default initial user
			Player = "Player 1";
			Mark = 'X';
			break;
		case "Player 1":
			Player = "Player 2";
			Mark = 'O';
			break;
		case "Player 2":
			Player = "Player 1";
			Mark = 'X';
			break;
		}
		
		System.out.println("Current Player " + Player);
	};
	
	//prints the playing board to see what is currently occupied in the playing space
	public static void printBoard() {
		
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		/*for (int r=0; r < 3; r++) {
			for (int c=0; c < 3; c++) {
				
			};
			System.out.println();
		};*/
		};
	
	// Check for win using rulees of Tic-Tac-Toe
	// Based on 8 possible combination of win by horizontal, diagonal, vetical matches
	public static void checkForWin(char playermark) {
		if (((board[0][0] == playermark) && (board[0][1] == playermark) && (board[0][2] == playermark)) ||
				((board[1][0] == playermark) && (board[1][1] == playermark) && (board[1][2] == playermark)) ||
				((board[2][0] == playermark) && (board[2][1] == playermark) && (board[2][2] == playermark)) ||
				((board[0][0] == playermark) && (board[1][0] == playermark) && (board[2][0] == playermark)) ||
				((board[0][1] == playermark) && (board[1][1] == playermark) && (board[2][1] == playermark)) ||
				((board[0][2] == playermark) && (board[1][2] == playermark) && (board[2][2] == playermark)) ||
				((board[0][0] == playermark) && (board[1][1] == playermark) && (board[2][2] == playermark)) ||
				((board[0][2] == playermark) && (board[1][1] == playermark) && (board[2][0] == playermark))) {
				
			System.out.println(Player + " WINS!!");
			System.exit(0);
		} 
		System.out.println("No One wins yet");
	}

	//Check to see if placement on board is currently occupied
	public static void validateMove(int chkRow, int chkCol) {
		if (board[chkRow][chkCol] == 'X' || board[chkRow][chkCol] == 'O') {
			System.out.println("Spot is already in use, "+ Player +" please select again!");
			printBoard();
			playerSelect(Player,Mark);
		};		
	};
	
	
	public static void placeMark(int inRow, int inCol) {
		validateMove(inRow, inCol);
		System.out.println("Placing " + Mark + " at row: " + inRow + ", column: " + inCol);
		board[inRow][inCol]=Mark;
	};

	public static void playerSelect(String playerTurn, char playerMark) {
		//Prompt for row (0-2)
		System.out.println(playerTurn + ", Select Row to Place Mark");
		Scanner reader = new Scanner(System.in);
		int Playerrow = reader.nextInt();
		
		//Prompt for column (0-3)
		System.out.println(playerTurn + ", Select Column to Place Mark");
		int Playercol = reader.nextInt();
		
		// Checks to see if placement is within parameters of the board
		while (Playerrow > 2 || Playercol > 2) {
			System.out.println("You have chosen a space not on the board");
			System.out.println(playerTurn + ", Select Row to Place Mark");
			 Playerrow = reader.nextInt();
			System.out.println(playerTurn + ", Select Column to Place Mark");
			 Playercol = reader.nextInt();
		}
		placeMark(Playerrow,Playercol);
			
		}
	

}
