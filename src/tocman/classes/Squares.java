package tocman.classes;

public class Squares {

    public Square getSquare(int index) {
        return squares[index];
    }

    public void setSquare(Square square, int index) {
        this.squares[index] = square;
    }

    private Square[] squares;

    public Squares(int quantity){
        squares = new Square[quantity];
    }

    public double getAverageArea(){
        double area = 0;
        for (Square square:squares){
            area += square.getArea();
        }
        return area/squares.length;
    }
}
