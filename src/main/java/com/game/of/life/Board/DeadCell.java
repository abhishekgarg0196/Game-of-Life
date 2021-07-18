package com.game.of.life.Board;

public class DeadCell implements Cell {
	public boolean isLiving() {
		return Boolean.FALSE;
	}

	public int getCellValue() {
		return 0;
	}
}
