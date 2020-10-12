package com.blindchess.model;

import com.blindchess.model.chessmen.ChessMen;

/* This class represents a square on the chess board. 
   It is represent by its x co-ordinate called file through letters a-h.
   and its y co-ordinate called rank through digits 1-8.
*/
public class Square {
private int rank;
private char file;
private String color;
private ChessMen occupiedby;

public ChessMen getOccupiedby() {
	return occupiedby;
}
public void setOccupiedby(ChessMen occupiedby) {
	this.occupiedby = occupiedby;
}
public String getColor() {
	if((rank + file)%2==0) {
		color = "Black";
	}
	else {
		color = "White";
	}
	return color;
}
private boolean isOccupied;
public boolean getIsOccupied() {
	return isOccupied;
}
public void setIsOccupied(boolean isOccupied) {
	this.isOccupied = isOccupied;
}

public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public char getFile() {
	return file;
}
public void setFile(char file) {
	this.file = file;
}
@Override
public String toString() {
return Character.toString(file).toLowerCase() + Integer.toString(rank);
}

}
