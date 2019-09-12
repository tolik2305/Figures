package tocman.classes;

import lombok.Getter;
import lombok.Setter;

import static tocman.classes.FuncUtils.floatFormat;

public class Cube extends Square {

    private static final int EDGES = 6;

    @Getter @Setter double side;

    public Cube(double side){
        super(side>0?side:0);
        this.side=side>0?side:0;
    }

    public Cube(){
        this.side = 0;
    }

    private double getVolume(){
        return super.getArea() * this.side;
    }

    @Override
    public double getArea(){
        return super.getArea() * EDGES;
    }

    @Override
    public String toString() {
            String str;
            if(this.side!=0) {
                        str = "Cube:" + "\n\tside = " + floatFormat(side) +
                        "\n\tarea = " + floatFormat(getArea()) +
                        "\n\tperimeter = " + floatFormat(getPerimeter() * 3) +
                        "\n\tdiagonal = " + floatFormat(getDiagonal() * Math.sqrt(3) / Math.sqrt(2)) +
                        "\n\tvolume = " + floatFormat(getVolume());
            }
            else {
                str = "Cube: \n\tside = 0";
            }
            return str;
    }
}
