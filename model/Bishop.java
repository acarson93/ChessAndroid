package model;

public class Bishop extends Piece {

	public String getName() {
		return "b";
	}

	public boolean validateMove(Square endingSquare) {
		if (endingSquare.x - getLocation().x != 0) {
			if ((endingSquare.y - getLocation().y) / (endingSquare.x - getLocation().x) == 1 ||
					(endingSquare.y - getLocation().y) / (endingSquare.y - getLocation().x) == -1) {
				return this.pieceBlocking(endingSquare);
			}
		}
		return false;
	}
}
