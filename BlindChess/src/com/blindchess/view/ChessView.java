package com.blindchess.view;

import com.blindchess.model.Board;
import com.blindchess.model.chessmen.King;

public class ChessView {

	public static void main(String[] args) {
		Board b = new Board();
		King k = new King(true);
		k.setPosition(b.aSquare('e', 1));
		System.out.println(b);
		System.out.println(k);
		
	}

}
