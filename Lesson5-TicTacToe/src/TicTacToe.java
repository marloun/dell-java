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

		for(int i=0; i<10; i++) {
		printBoard();
		playerSelect();
		}		
	};
	
	public static void printBoard() {
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
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
	
	public static void playerSelect() {
		System.out.println("Player1, Select Row to Place Mark");
		Scanner reader = new Scanner(System.in);
		int Playerrow = reader.nextInt();
		System.out.println("Player2, Select Column to Place Mark");
		int Playercol = reader.nextInt();
		char playerMark = 'o';
		placeMark(Playerrow,Playercol,playerMark);
				
	};
	
	
	

}
