package Access_Modifier.Bai_Tap;

public class AccessModifier {
    private double radius;
    private String color;
    public AccessModifier() {
        this.color = "Red";
        this.radius = 1.0;
    }
    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (getRadius() * getRadius() * Math.PI);
    }
}
