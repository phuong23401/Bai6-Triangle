public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape(1.3, 2.5, 3.0);

        System.out.println(shape.toString());
        System.out.println("Chu vi = " + shape.getPerimeter(1.3, 2.5, 3.0));
        System.out.println("Diện tích = " + shape.getArea(2.5, 4));
    }
}
