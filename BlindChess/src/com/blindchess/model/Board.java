package com.blindchess.model;


public class Board {
	private static int boardNum = 0;
private Square sixtyFourSquares[][] = new Square[8][8];
public Square aSquare(char file,int rank) {
	return sixtyFourSquares[file-97][rank-1];
}
public Board() {
		for(int i = 0; i<8; i++) {
		for(int j = 0; j<8; j++) {
			sixtyFourSquares[i][j] = new Square();
			sixtyFourSquares[i][j].setFile((char)(97+i));
			sixtyFourSquares[i][j].setRank(1+j);
			}
	}
		boardNum++;
}
@Override
public String toString() {
	return "Board " + Integer.toString(boardNum++);
}


}
