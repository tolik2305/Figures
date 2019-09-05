package tocman.Classes;

public class Square {

    private double side=0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side > 0 ? side:-1;
    }

    public Square(){
    }

    public Square(double side){
        setSide(side);
    }

    public double getArea(double side){
        double area = side * side;
        return area;
    }

    public double getPerimeter(double side){
        double perimeter = side * 4;
        return perimeter;
    }

    public double getDiagonal(double side){
        double diagonal = side * Math.sqrt(2);
        return diagonal;
    }

    @Override
    public String toString() {
        return "Square:" +
                "\n\tside = " + side +
                "\n\tarea = " + getArea(side) +
                "\n\tperimeter = " + getPerimeter(side) +
                "\n\tdiagonal = " + getDiagonal(side);
    }
}
