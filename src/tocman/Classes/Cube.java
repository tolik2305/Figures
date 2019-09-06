package tocman.Classes;

import lombok.Getter;

public class Cube extends Square {

    @Getter double side=0;

    public Cube(double side){
        setSide(side);
    }

    public Cube(){
    }

    public void setSide(double side) {
        this.side = side > 0 ? side:0;
    }

    private double getVolume(double side){
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
            String str;
            if(this.side!=0) {
                        str = "Cube:" + "\n\tside = " + side +
                        "\n\tarea = " + getArea(side) * 6 +
                        "\n\tperimeter = " + getPerimeter(side) * 3 +
                        "\n\tdiagonal = " + getDiagonal(side) * Math.sqrt(3) / Math.sqrt(2) +
                        "\n\tvolume = " + getVolume(side);
            }
            else
                str="Cube: \n\tside = 0";
            return str;
    }
}
