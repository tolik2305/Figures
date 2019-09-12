package tocman;

import tocman.classes.Cube;
import tocman.classes.Cubes;
import tocman.classes.Square;
import tocman.classes.Squares;

import java.util.Locale;
import java.util.Scanner;

import static tocman.classes.FuncUtils.floatFormat;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int quantitySquares = 0;
        boolean isCorrectly = false;
        while(!isCorrectly) {
            System.out.println("Введите кол-во квадратов: ");
            String str1 = scanner.next();
            isCorrectly = isCorrect(str1, true);
            if(isCorrectly) {
                quantitySquares = Integer.parseInt(str1);
            }
            else {
                System.out.println("Введите целое число которое больше нуля!!!");
            }
        }
        Squares squares = new Squares(quantitySquares);
        int i = 0;
        do {
            System.out.println("Введите сторону квадрата " + (i + 1) +": ");
            String str2 = scanner.next();
            isCorrectly = isCorrect(str2, false);
            if(isCorrectly) {
                squares.setSquare(new Square(Double.parseDouble(str2)), i);
                System.out.println(squares.getSquare(i) + "\n");
                i++;
            }
            else{
                System.out.println("Введите число которое больше нуля!!!");
            }
        }while (i < quantitySquares);

        System.out.println("Средняя площадь квадратов: "+floatFormat(squares.getAverageArea()));


        int quantityCubes=0;
        isCorrectly=false;
        while(!isCorrectly) {
            System.out.println("Введите кол-во кубов: ");
            String str3 = scanner.next();
            isCorrectly = isCorrect(str3, true);
            if(isCorrectly) {
                quantityCubes = Integer.parseInt(str3);
            }
            else {
                System.out.println("Введите целое число которое больше нуля!!!");
            }
        }

        Cubes cubes = new Cubes(quantityCubes);
        i=0;
        do{
            System.out.println("Введите сторону куба " + (i + 1) +": ");
            String str4 = scanner.next();
            isCorrectly = isCorrect(str4, false);
            if(isCorrectly) {
                cubes.setCube(new Cube(Double.parseDouble(str4)), i);
                System.out.println(cubes.getCube(i) + "\n");
                i++;
            }
            else {
                System.out.println("Введите число которое больше нуля!!!");
            }
        }while(i < quantityCubes);

        System.out.println("Кубов с наибольшей площадью: " + cubes.getQuantityMaxArea());
    }

    private static boolean isCorrect(String input, boolean isQuantity){
        if (isQuantity) {
            for (char str : input.toCharArray()) {
                if (!Character.isDigit(str)) {
                    return false;
                }
            }
        }
        else {
            for (int i=0;i<input.length();i++){
                if (input.matches("[^0-9]")){
                    return false;
                }
            }
        }
        return true;
    }
}