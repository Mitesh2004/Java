interface CubeFunction {
    int cube(int x);
}

public class CubeExample {
    public static void main(String[] args) {
        CubeFunction cube = (x) -> x * x * x;
        System.out.println("Cube: " + cube.cube(3));
    }
}
