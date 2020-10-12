package Inheritance.Bai_tap.Point_MoveablePoint;

public class Point {
    float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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

    public void setX(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x, y: " + getX() + " , " + getY();
    }
    public static void main(String[] args) {
        Point point = new Point(2, 2);
        System.out.println(point);
    }
}

