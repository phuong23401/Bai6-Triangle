import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ 3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double h = scanner.nextDouble();
        System.out.print("Nhập màu: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle.toString());
        System.out.println("Chu vi = " + triangle.getPerimeter(side1, side2, side3));
        System.out.println("Diện tích = " + triangle.getArea(side3, h));
    }
}
