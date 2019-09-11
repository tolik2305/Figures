package tocman;

import tocman.Classes.Cube;
import tocman.Classes.Square;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantitySquares = 0;
        double averageArea = 0;
        boolean isNotCorrect = true;
        while(isNotCorrect) {
            System.out.println("Введите кол-во квадратов: ");
            String str1 = scanner.next();
            isNotCorrect = isCorrect(str1, 1);
            if(!isNotCorrect)
                quantitySquares = Integer.parseInt(str1);
            else
                System.out.println("Введите целое число которое больше нуля!!!");
        }
        double[] sideSquare = new double[quantitySquares];
        for (int i=0; i < quantitySquares; i++){
            System.out.println("Введите сторону квадрата " + (i + 1) +": ");
            String str2 = scanner.next();
            isNotCorrect = isCorrect(str2);
            if(!isNotCorrect)
                sideSquare[i] =  Double.parseDouble(str2);
            else{
                System.out.println("Введите число которое больше нуля!!!");
                i--;
                continue;
            }
            Square square = new Square(sideSquare[i]);
            System.out.println(square.toString() + '\n');
            averageArea+=square.getArea(sideSquare[i]);
        }

        int quantityCubes=0;
        isNotCorrect=true;
        while(isNotCorrect) {
            System.out.println("Введите кол-во кубов: ");
            String str3 = scanner.next();
            isNotCorrect = isCorrect(str3, 1);
            if(!isNotCorrect)
                quantityCubes = Integer.parseInt(str3);
            else
                System.out.println("Введите целое число которое больше нуля!!!");
        }

        double[] sideCubes = new double[quantityCubes];
        double maxArea = 0;
        int countMaxArea = 0;
        for (int i=0; i < quantityCubes; i++){
            System.out.println("Введите сторону куба " + (i + 1) +": ");
            String str4 = scanner.next();
            isNotCorrect = isCorrect(str4);
            if(!isNotCorrect)
                sideCubes[i] =  Double.parseDouble(str4);
            else {
                System.out.println("Введите число которое больше нуля!!!");
                i--;
                continue;
            }
            Cube cube = new Cube(sideCubes[i]);
            System.out.println(cube.toString() + '\n');
            if(cube.getArea(sideCubes[i])>maxArea) {
                maxArea = cube.getArea(sideCubes[i]);
                countMaxArea=0;
            }
            if(maxArea==cube.getArea(sideCubes[i]))
                countMaxArea++;
        }
        double averageAreaSquares = 0;
        if (quantitySquares != 0)
            averageAreaSquares = averageArea/quantitySquares;
        System.out.println("\nСредняя площадь квадратов: " + averageAreaSquares + "" +
                "           \nКол-во кубов с наибольшей площадью: " + countMaxArea);
    }

    public static boolean isCorrect(String str){
        boolean isNotCorrectly = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Double.parseDouble(str) <= 0)
                isNotCorrectly = true;
        }
        return isNotCorrectly;
    }

    public static boolean isCorrect(String str, int num){
        boolean isNotCorrectly = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Double.parseDouble(str) <= 0||((Double.parseDouble(str)%num)!=0))
                isNotCorrectly = true;
        }
        return isNotCorrectly;
    }
}