
public class NQueen {

	/**
	 * A utility function to check if a queen can
	 * be placed on board[row][col]. Note that this 
	 * function is called when "col" queens are already 
	 * placeed in columns from 0 to col -1. So we need 
	 * to check only left side for attacking queens
	 * @param board
	 * @param row
	 * @param col
	 * @return true if safe move
	 */
	boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 

		// Check this row on left side
		for (i = 0; i < col; i++){
			if (board[row][i] == 1){ 
				return false;
			}
		}

		// Check upper diagonal on left side
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--){
			if (board[i][j] == 1){
				return false;
			}
		}

		// Check lower diagonal on left side
		for (i = row, j = col; j >= 0 && i < board.length; i++, j--){
			if (board[i][j] == 1){
				return false;
			}
		}

		return true; 
	} 
	/**
	 * Recursive utility function to solve N Queen problem
	 * @param board
	 * @param col
	 * @return Solution exist or not
	 */
	boolean solveNQueens(int board[][], int col) 
	{ 
		//base case: all queens are placed
		if (col >= board.length) 
			return true; 

		/* Consider this column and try placing 
        this queen in all rows one by one */
		for (int i = 0; i < board.length; i++) { 
			// Check if the queen can be placed on board[i][col]
			if (isSafe(board, i, col)) { 
				/* Place this queen in board[i][col] */
				board[i][col] = 1; 

				// recur to place rest of the queens
				if (solveNQueens(board, col + 1) == true) 
					return true; 

				// If Solution not found
				board[i][col] = 0;
			} 
		} 

		// If no solution found
		return false; 
	} 
	/**
	 * function is used to solve N-queen problem
	 * @param board array Matrix for N-Queen problem
	 * @return Solved binary board for N-Queen
	 */
	public int[][] getNQueenSolution(int board[][]){
		if(board.length != board[0].length){
			throw new AssertionError("Invalid Dimension");
		}
		//if solution exist return Solution
		if (!solveNQueens(board, 0)){
			return board;
		}
		//else return original board
		return board;
	}


}
