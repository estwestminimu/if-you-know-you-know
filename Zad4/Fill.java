import java.util.List;

/**
 * Klasa abstrakcyjna narzÄdzia do wypeĹniania pĹĂłtna kolorem.
 */
public abstract class Fill {
	/**
	 * Zlecenie wypeĹnienia obszaru kolorem. PĹĂłtno, na ktĂłrym naleĹźy wykonaÄ
	 * operacje, lista sÄsiadĂłw, pozycja startowa, od ktĂłrej rozpoczyna siÄ
	 * wypeĹnianie oraz docelowa jasnoĹÄ podawane sÄ przez uĹźytkownika w wywoĹaniu
	 * metody.
	 * 
	 * @param canvas     pĹĂłtno
	 * @param neighbours lista pozycji sÄsiednich pikseli liczona wzglÄdem piksela o
	 *                   poĹoĹźeniu (0,0). PoĹoĹźenia pikseli na tej liĹcie mogÄ
	 *                   zawieraÄ liczby ujemne.
	 * @param start      poĹĂłĹźenie piksela, od ktĂłrego rozpoczyna siÄ proces
	 *                   wypeĹniania kolorem
	 * @param brightness tym "kolorem" wypeĹniany jest obszar
	 */
	public abstract void fill(Canvas canvas, List<Position2D> neighbours, Position2D start, int brightness);
}