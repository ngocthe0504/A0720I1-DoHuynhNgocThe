package Abstract_Interface.Bai_tap.Interface;

import Abstract_Interface.Bai_tap.Circle;
import Abstract_Interface.Bai_tap.Rectangle;
import Abstract_Interface.Bai_tap.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        square.resize(0.1);
        System.out.println(square);
        System.out.println("Chu vi hinh vuong: " + square.getArea());
        System.out.println("Dien tich hinh vuong : " + square.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println(circle);
        circle.resize(0.1);
        System.out.println(circle);
        System.out.println("Chu vi hinh tron: " + circle.getArea());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        circle.resize(0.1);
        System.out.println(rectangle);
        System.out.println("Chu vi hinh CN: " + rectangle.getArea());
        System.out.println("Dien tich hinh CN : " + rectangle.getPerimeter());
    }
}
