package tocman.Classes;

import lombok.Getter;
import lombok.Setter;

public class Square {

    @Getter @Setter double side=0;

    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }

    public double getArea(double side) {
        double area = side * side;
        return area;
    }

    public double getArea(double side, int quantitySides){
        double area = side * side * quantitySides;
        return  area;
    }

    public double getPerimeter(double side) {
        double perimeter = side * 4;
        return perimeter;
    }

    public double getDiagonal(double side) {
        double diagonal = side * Math.sqrt(2);
        return diagonal;
    }

    @Override
    public String toString() {
        String str;
        if (side != 0) {
            str = "Square:" +
                    "\n\tside = " + side +
                    "\n\tarea = " + getArea(side) +
                    "\n\tperimeter = " + getPerimeter(side) +
                    "\n\tdiagonal = " + getDiagonal(side);
        } else
            str = "Square:" +
                    "\n\tside = 0";
        return str;
    }
}
