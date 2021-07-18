package com.game.of.life.Board;

public class AliveCell implements Cell {

	public boolean isLiving() {
		return Boolean.TRUE;
	}

	public int getCellValue() {
		return 1;
	}
}
