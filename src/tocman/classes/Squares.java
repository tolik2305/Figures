package tocman.classes;

/**
 * Класс для инициализации квадратов
 */
public class Squares {

    /**
     *
     * @param index индекс квадрата
     */
    public Square getSquare(final int index) {
        return squares[index];
    }

    /**
     * @param square класс Square
     * @param index индекс квадрата
     */
    public void setSquare(final Square square, final int index) {
        this.squares[index] = square;
    }

    /**
     * Массив квадратов
     */
    private final Square[] squares;

    /**
     * Кол-во квадратов
     * @param quantity кол-во квадратов
     */
    public Squares(final int quantity){
        squares = new Square[quantity];
    }

    /**
     * Средняя площадь квадратов
     */
    public double getAverageArea(){
        double area = 0;
        for (final Square square:squares){
            area += square.getArea();
        }
        return area/squares.length;
    }
}
