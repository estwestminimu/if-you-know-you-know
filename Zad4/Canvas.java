/**
 * Klasa reprezentuje pĹĂłtno o staĹej liczbie kolumn i wierszy. Kolor (jasnoĹÄ) piksela
 * na pĹĂłtnie reprezentuje liczba caĹkowita. PoĹoĹźenia pikseli na pĹĂłtnie zawierajÄ siÄ
 * od (0,0) do getMaxPosition wĹÄcznie. WyjĹcie poza poprawny obszar pĹĂłtna powoduje bĹÄd.
 */
public abstract class Canvas {
	/**
	 * Pobranie jasnoĹci piksela znajdujÄcego siÄ na pozycji position.
	 * @param position poĹoĹźenie piksela
	 * @return jego jasnoĹÄ w zakresie od 0 do 255
	 */
	abstract public int getBrightness( Position2D position );
	/**
	 * Ustawienie jasnoĹci piksela na pozycji position na brightness.
	 * @param position poĹoĹźenie piksela
	 * @param brightness jasnoĹÄ do ustawienia od 0 do 255
	 */
	abstract public void setBrightness( Position2D position, int brightness );
	
	/**
	 * PoĹoĹźenie piksela o najwiÄkszej poprawnej liczbie kolumn i wierszy.
	 * MoĹźna odczytaÄ i zmieniÄ poĹoĹźenie tego piksela.
	 * @return maksymalne poprawne poĹoĹźenie piksela na pĹĂłtnie
	 */
	abstract public Position2D getMaxPosition();
}