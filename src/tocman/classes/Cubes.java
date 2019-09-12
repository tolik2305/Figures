package tocman.classes;

public class Cubes {

    public Cube getCube(int index) {
        return cubes[index];
    }

    public void setCube(Cube cubes, int index) {
        this.cubes[index] = cubes;
    }

    private Cube[] cubes;

    public Cubes(int quantity){
        cubes = new Cube[quantity];
    }

    public int getQuantityMaxArea(){
        double maxArea = 0;
        int countMaxArea = 0;
        for (Cube cube: cubes){
            if(maxArea<cube.getArea()){
                maxArea=cube.getArea();
            }
        }
        for (Cube cube: cubes){
            if(maxArea==cube.getArea()){
                countMaxArea++;
            }
        }
        return countMaxArea;
    }
}
