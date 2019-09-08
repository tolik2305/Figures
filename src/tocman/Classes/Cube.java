package tocman.Classes;

import lombok.Getter;
import lombok.Setter;

public class Cube extends Square {

    @Getter @Setter double side=0;

    public Cube(double side){
        this.side=side;
    }

    public Cube(){
    }

    private double getVolume(double side){
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
            String str;
            if(this.side!=0) {
                        str = "Cube:" + "\n\tside = " + side +
                        "\n\tarea = " + getArea(side, 6) +
                        "\n\tperimeter = " + getPerimeter(side) * 3 +
                        "\n\tdiagonal = " + getDiagonal(side) * Math.sqrt(3) / Math.sqrt(2) +
                        "\n\tvolume = " + getVolume(side);
            }
            else
                str="Cube: \n\tside = 0";
            return str;
    }
}
