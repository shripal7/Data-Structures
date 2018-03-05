package easy;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isValidSudoku(char[][] board) {

		HashSet<Character> rows = new HashSet<Character>();
		HashSet<Character> col = new HashSet<Character>();
		HashSet<Character> cube = new HashSet<Character>();
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
//				if(board[i][j] != '.' && !rows.add(board[i][j]))
//					return false;
				
				
			}
		}
		return true;
	}

}
