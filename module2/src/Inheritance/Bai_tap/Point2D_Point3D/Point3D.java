package Inheritance.Bai_tap.Point2D_Point3D;

public class Point3D extends Point2D {
    float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return x + "," + y + "," + z;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,10,3);
        System.out.println(point3D);
    }
}
