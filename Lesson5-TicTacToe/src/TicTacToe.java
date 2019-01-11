import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	public static char[][] board = new char [3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample Board
		/*board[0][0]='x';
		board[0][1]='o';
		board[0][2]='x';
		board[1][2]='x';
		board[1][0]='x';
		board[1][1]='o';
		board[2][2]='x';
		board[2][0]='x';
		board[2][1]='o';*/	
		String Player = "Player 1";

		for(int i=0; i<10; i++) {
		printBoard();		
		playerSelect(Player);
		}		
	};
	
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
	
	public static void checkforrwin(char playermark) {
		
	};
	
	public static void determineTurn() {
		
		
	};
	
	public static void validateMove() {
		
	};
	
	public static void retrieveInput() {
		
	};
	
	public static void placeMark(int row, int col, char mark) {
		board[row][col]=mark;
	};

	public static void playerSelect(String playerTurn) {
		System.out.println(playerTurn + ", Select Row to Place Mark");
		Scanner reader = new Scanner(System.in);
		int Playerrow = reader.nextInt();
		System.out.println(playerTurn + ", Select Column to Place Mark");
		int Playercol = reader.nextInt();
		char playerMark = 'X';
		if (playerTurn.equals("Player 1")) {
			playerMark = 'O';
			};
		placeMark(Playerrow,Playercol,playerMark);
				
	};	

}
