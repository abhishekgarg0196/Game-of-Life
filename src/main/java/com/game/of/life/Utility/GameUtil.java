package com.game.of.life.Utility;

import com.game.of.life.Board.AliveCell;
import com.game.of.life.Board.Cell;
import com.game.of.life.Board.DeadCell;
import com.game.of.life.Enum.CellStatus;

public class GameUtil {

	final static int[][] dirs = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
			{ -1, -1 } };

	public static int Count(int[][] board, int row, int column) {
		int result = 0;
		for (int[] dir : dirs) {
			int newRow = row + dir[0];
			int newCol = column + dir[1];

			if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length
					&& (board[newRow][newCol] == 1 || board[newRow][newCol] == 2)) {
				result++;
			}
		}
		return result;
	}

	public static void UpdateBoard(int[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col] == -1) {
					Cell live = new AliveCell();
					board[row][col] = live.getCellValue();
				}

				if (board[row][col] == 2) {
					Cell dead = new DeadCell();
					board[row][col] = dead.getCellValue();
				}
			}
		}
		printMatrix(board);
	}

	public static void printMatrix(int[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == 1) {
					// System.out.print(CellStatus.ALIVE.toString());
					System.out.print(" Alive");
				} else {
					// System.out.print(CellStatus.DEAD.toString());
					System.out.print(" Dead");
				}
			}
			System.out.println();
		}
	}
}
