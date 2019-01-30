import java.util.*;

public class TicTacToe2 {

	public static char[][] board = new char [3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Player = new String("");

		for(int i=0; i<10; i++) {
		printBoard();		
		playerSelect(Player);
		};

	}
	
	public static void printBoard() {
		
	};
	
	public static void playerSelect(String PlayerTurn) {
		
	};

	public static void placeMark(int row, int col, char mark) {
		board[row][col]=mark;
	};
}
