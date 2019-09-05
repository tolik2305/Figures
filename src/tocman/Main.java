package tocman;

import tocman.Classes.Cube;
import tocman.Classes.Square;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во квадратов: ");
        int quantitySquares = scanner.nextInt();
        double[] sideSquare = new double[quantitySquares];
        double averageArea = 0;
        for (int i=0; i < quantitySquares; i++){
            System.out.println("Введите сторону квадрата " + (i + 1) +": ");
            sideSquare[i] =  scanner.nextInt();
            Square square = new Square(sideSquare[i]);
            System.out.println(square.toString() + '\n');
            averageArea+=square.getArea(sideSquare[i]);
        }

        System.out.println("Введите кол-во кубов: ");
        int quantityCubes = scanner.nextInt();
        double[] sideCubes = new double[quantityCubes];
        double maxArea = 0;
        int countMaxArea = 0;
        for (int i=0; i < quantityCubes; i++){
            System.out.println("Введите сторону куба " + (i + 1) +": ");
            sideCubes[i] =  scanner.nextInt();
            Cube cube = new Cube(sideCubes[i]);
            System.out.println(cube.toString() + '\n');
            if(cube.getArea(sideCubes[i])>maxArea) {
                maxArea = cube.getArea(sideCubes[i]);
                countMaxArea=0;
            }
            if(maxArea==cube.getArea(sideCubes[i]))
                countMaxArea++;
        }
        if(quantitySquares==0)
            quantitySquares=1;
        System.out.println("\nСредняя площадь квадратов: "+ (averageArea/quantitySquares) +"" +
                "           \nКол-во кубов с наибольшей площадью: "+countMaxArea);
    }
}
