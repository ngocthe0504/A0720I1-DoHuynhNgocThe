package Inheritance.Bai_tap.Point2D_Point3D;

public class Point2D {
    float x, y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,2);
        System.out.println(point2D);
    }
}
