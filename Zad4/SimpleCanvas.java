import java.util.Arrays;

public class SimpleCanvas extends Canvas {
    private final int[][] pixels; // dwuwymiarowa tablica przechowująca jasności pikseli
    private final int rows;       // liczba wierszy
    private final int cols;       // liczba kolumn

    public SimpleCanvas(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.pixels = new int[rows][cols]; // Inicjalizujemy tablicę jasności (0 = czarny)
    }

    @Override
    public int getBrightness(Position2D position) {
        return pixels[position.getRow()][position.getCol()];
    }

    @Override
    public void setBrightness(Position2D position, int brightness) {
        pixels[position.getRow()][position.getCol()] = brightness;
    }

    @Override
    public Position2D getMaxPosition() {
        return new Position2D(cols-1, rows-1); // maksymalne dozwolone położenie
    }

    // Metoda pomocnicza do wyświetlania płótna w konsoli
    public void printCanvas() {
        for (int[] row : pixels) {
            System.out.println(Arrays.toString(row));
        }
    }
}
