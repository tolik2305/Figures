package tocman;

import tocman.classes.ClassCube;
import tocman.classes.Cubes;
import tocman.classes.Square;
import tocman.classes.Squares;

import java.util.Locale;
import java.util.Scanner;

import static tocman.classes.FuncUtils.floatFormat;

/**
 * Основная класс ClassMain
 */
class ClassMain {
    /**
     * Основная статическая функция
     */
    public static void main(final String[] args) {
        Locale.setDefault(Locale.US);
        final Scanner scanner = new Scanner(System.in);
        int quantitySquares = 0;
        boolean isCorrectly = false;
        while(!isCorrectly) {
            System.out.println("Введите кол-во квадратов: ");
            final String str1 = scanner.next();
            isCorrectly = isCorrect(str1, true);
            if(isCorrectly) {
                quantitySquares = Integer.parseInt(str1);
            }
            else {
                reenterNumber();
            }
        }
        final Squares squares = new Squares(quantitySquares);
        int tempVariable = 0;
        do {
            System.out.println("Введите сторону квадрата " + (tempVariable + 1) +": ");
            final String str2 = scanner.next();
            isCorrectly = isCorrect(str2, false);
            if(isCorrectly) {
                squares.setSquare(new Square(Double.parseDouble(str2)), tempVariable);
                System.out.println(squares.getSquare(tempVariable) + "\n");
                tempVariable++;
            }
            else{
                reenterNumber();
            }
        }while (tempVariable < quantitySquares);

        System.out.println("Средняя площадь квадратов: "+floatFormat(squares.getAverageArea()));

        int quantityCubes=0;
        isCorrectly=false;
        while(!isCorrectly) {
            System.out.println("Введите кол-во кубов: ");
            final String str3 = scanner.next();
            isCorrectly = isCorrect(str3, true);
            if(isCorrectly) {
                quantityCubes = Integer.parseInt(str3);
            }
            else {
                reenterNumber();
            }
        }

        final Cubes cubes = new Cubes(quantityCubes);
        tempVariable=0;
        do{
            System.out.println("Введите сторону куба " + (tempVariable + 1) +": ");
            final String str4 = scanner.next();
            isCorrectly = isCorrect(str4, false);
            if(isCorrectly) {
                cubes.setCube(new ClassCube(Double.parseDouble(str4)), tempVariable);
                System.out.println(cubes.getCube(tempVariable) + "\n");
                tempVariable++;
            }
            else {
                reenterNumber();
            }
        }while(tempVariable < quantityCubes);

        System.out.println("Кубов с наибольшей площадью: " + cubes.getQuantityMaxArea());
    }

    private static void reenterNumber(){
        System.out.println("Введите корректное положительное число!!!");
    }

    private static boolean isCorrect(final String input, final boolean isQuantity){
        boolean isCorrectly = true;

        if (isQuantity) {
            for (final char str : input.toCharArray()) {
                if (!Character.isDigit(str)) {
                    isCorrectly=false;
                }
            }
        }
        else {
            if (input.matches("[^0-9]")){
                isCorrectly = false;
            }
        }
        return isCorrectly;
    }
}