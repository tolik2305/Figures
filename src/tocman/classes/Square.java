package tocman.classes;

import lombok.Getter;
import lombok.Setter;

import static tocman.classes.FuncUtils.floatFormat;

/**
 * Класс Square для квадрата
 */
public class Square {

    /**
     * Сторона квадрата
     * @param side
     */
    @Getter @Setter private double side;

    /**
     * Кол-во сторон в квадрате
     * @param SIDES
     */
    private static final double SIDES = 4;

    /**
     * Пустой конструктор для квадрата
     */
    Square() {
        this.side=0;
    }

    /**
     * Конструктор с параметром сторона
     * @param side сторона квадрата
     */
    public Square(final double side) {
        this.side = side>0?side:0;
    }

    /**
     * Нахождение площади Квадрата
     */
    public double getArea(){
        return this.side * this.side;
    }

    /**
     * Нахождение периметра квадрата
     */
    double getPerimeter() {
        return this.side * SIDES;
    }

    /**
     * Нахождение диагонали квадрата
     */
    double getDiagonal() {
        return side * Math.sqrt(2);
    }

    /**
     * Вывод результатов на экран
     */
    @Override
    public String toString() {
        String str;
        str = this.side != 0 ?         // Тернарный оператор
                    "Square:" +
                    "\n\tside = " + this.side +
                    "\n\tarea = " + floatFormat(getArea()) +
                    "\n\tperimeter = " + floatFormat(getPerimeter()) +
                    "\n\tdiagonal = " + floatFormat(getDiagonal())
                    :
                    "Square:" +
                    "\n\tside = 0";
        return str;
    }
}
