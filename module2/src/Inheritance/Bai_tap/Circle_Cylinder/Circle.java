package Inheritance.Bai_tap.Circle_Cylinder;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return (2 * getRadius() * Math.PI);
    }
    public double getAcreage() {
        return (getRadius() * getRadius() * Math.PI);
    }

    @Override
    public String toString() {
        return "Hinh tron co dien tich va chu vi la: " + getAcreage() + ","
                + getArea() + " co mau: " + getColor();
    }

    public static void main(String[] args) {
            Circle circle = new Circle(3, "blue");
        System.out.println(circle);
    }
}
