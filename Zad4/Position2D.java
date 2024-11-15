/**
 * Klasa reprezentuje poĹoĹźenie piksela na pĹĂłtnie. PoĹoĹźenie jest niezmienne.
 */
public class Position2D {
	private final int col;
	private final int row;

	public Position2D(int col, int row) {
		this.col = col;
		this.row = row;
	}

	@Override
	public String toString() {
		return "Position2D [col=" + col + ", row=" + row + "]";
	}

	/**
	 * Kolumna, w ktĂłrej znajduje siÄ piksel.
	 * 
	 * @return numer kolumny
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Wiersz, w ktĂłrym znajduje siÄ piksel.
	 * 
	 * @return numer wiersza
	 */
	public int getRow() {
		return row;
	}
}