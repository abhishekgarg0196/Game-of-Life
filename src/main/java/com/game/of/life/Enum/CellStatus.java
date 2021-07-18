package com.game.of.life.Enum;

public enum CellStatus {
	ALIVE("▦ \uD83D\uDE80 "), DEAD("□");

	private String value;

	CellStatus(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

}
