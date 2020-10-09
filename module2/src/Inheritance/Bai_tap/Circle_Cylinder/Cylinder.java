package Inheritance.Bai_tap.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.height = high;
    }

    public double getVolumetric() {
        return (getAcreage() * height);
    }

    @Override
    public String toString() {
        return "Hinh tru co the tich: " + getVolumetric() + " co mau: " + getColor();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "blue", 10);
        System.out.println(cylinder);
    }
}
