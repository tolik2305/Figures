package tocman.classes;

import lombok.Getter;
import lombok.Setter;

import static tocman.classes.FuncUtils.floatFormat;

/**
 * Класс ClassCube для куба
 */
public class ClassCube extends Square {

    /**
     * Константа равная кол-ву граней в квадрате
     */
    private static final int EDGES = 6;
    /**
     * @param side
     * Сторона Куба
     */
    @Getter @Setter private double side;

    /**
     * Конструктор на 1 параметр
     */
    public ClassCube(final double side){
        super(side);
    }

    /**
     * Пустой конструктор
     */
    public ClassCube(){
        super();
    }

    /**
     * Нахождение объёма куба
     */
    private double getVolume(){
        return super.getArea() * super.getSide();
    }

    /**
     * Нахождение площади куба
     */
    @Override
    public double getArea(){
        return super.getArea() * EDGES;
    }

    /**
     * Вывод результатов на экран
     */
    @Override
    public String toString() {
            String str;
            str = super.getSide()!=0 ?                     // тернарный оператор
                        "Cube:" + "\n\tside = " + super.getSide() +
                        "\n\tarea = " + floatFormat(getArea()) +
                        "\n\tperimeter = " + floatFormat(getPerimeter() * 3) +
                        "\n\tdiagonal = " + floatFormat(getDiagonal() * Math.sqrt(3) / Math.sqrt(2)) +
                        "\n\tvolume = " + floatFormat(getVolume())
                        :
                        "Cube: \n\tside = 0";
            return str;
    }
}
