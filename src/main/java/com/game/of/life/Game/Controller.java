package com.game.of.life.Game;

import com.game.of.life.Exception.GameControllerException;
import com.game.of.life.Utility.GameUtil;

public class Controller {
	public static void main(String[] args) {
		int[][] board = { { 1, 1 }, { 1, 0 } };
		gameOfLife(board);
	}

	public static void gameOfLife(int[][] board) {
		try {
			if (board == null || board.length == 0) {
				throw new GameControllerException("An error has occured while setuping the board for game");
			}
			int rowsLen = board.length;
			int coloumnsLen = board[0].length;

			for (int row = 0; row < rowsLen; row++) {
				for (int col = 0; col < coloumnsLen; col++) {
					if (board[row][col] == 0) {
						int livesCount = GameUtil.Count(board, row, col);
						if (livesCount == 3) {
							board[row][col] = -1; // Alive Cell
						}
					}
					if (board[row][col] == 1) {
						int livesCount = GameUtil.Count(board, row, col);
						if (livesCount < 2 || livesCount > 3) {
							board[row][col] = 2; // Dead Cell
						}
					}
				}
			}
			GameUtil.UpdateBoard(board);
		} catch (Exception e) {
			System.out.println("An error has occured while performing the board rules");
		}
	}
}
