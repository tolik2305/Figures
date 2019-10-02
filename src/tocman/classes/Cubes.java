package tocman.classes;

/**
 * Класс для инициализации кубов
 */
public class Cubes {

    /**
     * Индекс куба в массиве
     * @param index индекс куба
     */
    public ClassCube getCube(final int index) {
        return classCubes[index];
    }

    /**
     * Куб с индексом
     * @param cubes это наш ClassCube в котором
     * @param index индекс куба
     */
    public void setCube(final ClassCube cubes, final int index) {
        this.classCubes[index] = cubes;
    }

    /**
     * Массив кубов
     */
    private final ClassCube[] classCubes;

    /**
     * @param quantity кол-во кубов
     */
    public Cubes(final int quantity){
        classCubes = new ClassCube[quantity];
    }

    /**
     * Кол-во кубов с наибольшей площадью
     */
    public int getQuantityMaxArea(){
        double maxArea = 0;
        int countMaxArea = 0;
        for (final ClassCube classCube : classCubes){
            if(maxArea< classCube.getArea()){
                maxArea= classCube.getArea();
            }
        }
        for (final ClassCube classCube : classCubes){
            if(Math.abs(maxArea - classCube.getArea())<Math.pow(10, -10)){
                countMaxArea++;
            }
        }
        return countMaxArea;
    }
}
