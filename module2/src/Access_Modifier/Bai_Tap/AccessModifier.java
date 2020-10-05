package Access_Modifier.Bai_Tap;

public class AccessModifier {
    private double radius;
    private String color;
    public AccessModifier() {
        this.color = "Red";
        this.radius = 1.0;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}
