package tocman.classes;

import lombok.Getter;
import lombok.Setter;

import static tocman.classes.FuncUtils.floatFormat;

public class Square {

    @Getter @Setter double side;

    private final double SIDES = 4;

    public Square() {
        this.side=0;
    }

    public Square(double side) {
        this.side = side>0?side:0;
    }

    public double getArea(){
        return this.side * this.side;
    }

    double getPerimeter() {
        return this.side * SIDES;
    }

    double getDiagonal() {
        return side * Math.sqrt(2);
    }

    @Override
    public String toString() {
        String str;
        if (this.side != 0) {
            str = "Square:" +
                    "\n\tside = " + floatFormat(this.side) +
                    "\n\tarea = " + floatFormat(getArea()) +
                    "\n\tperimeter = " + floatFormat(getPerimeter()) +
                    "\n\tdiagonal = " + floatFormat(getDiagonal());
        } else {
            str = "Square:" +
                    "\n\tside = 0";
        }
        return str;
    }
}
