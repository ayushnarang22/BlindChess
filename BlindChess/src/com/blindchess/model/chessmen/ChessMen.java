package com.blindchess.model.chessmen;

import com.blindchess.model.Square;

public abstract class ChessMen{
	private String name;
	Square position;
	private Boolean isWhite;
	private Boolean isOnBoard;
	public int points;
	public ChessMen(Boolean isWhite) { 
		this.isWhite = isWhite;
		this.isOnBoard = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Square getPosition() {
		return position;
	}
	public void setPosition(Square position) {
		position.setIsOccupied(true);
		this.position = position;
		this.position.setOccupiedby(this);
	}
	
	public Boolean getIsWhite() {
		return isWhite;
	}
	public void setIsWhite(Boolean isWhite) {
		
		this.isWhite = isWhite;
	}
	
	
	public Boolean getIsOnBoard() {
		return isOnBoard;
	}
	public void setIsOnBoard(Boolean isOnBoard) {
		this.isOnBoard = isOnBoard;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Name = "+ this.name + " IsWhite? = "+this.getIsWhite() +" Position = " + this.position;
	}
	
}
