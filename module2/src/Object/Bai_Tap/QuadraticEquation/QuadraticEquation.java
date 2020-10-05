package Object.Bai_Tap.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return (Math.pow(this.b,2) - 4 * this.a * this.c);
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant()) / 2 * this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant()) / 2 * this.a);
    }
}

