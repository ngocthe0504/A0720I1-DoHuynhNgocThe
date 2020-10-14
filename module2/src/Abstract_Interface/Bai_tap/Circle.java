package Abstract_Interface.Bai_tap;

public class Circle extends Figure {
    private double radius = 1.0;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (2 * Math.PI * getRadius());
    }
    @Override
    public String toString() {
        return "Hinh tron co ban kinh = "
                + getRadius() + " "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent;
    }
}
