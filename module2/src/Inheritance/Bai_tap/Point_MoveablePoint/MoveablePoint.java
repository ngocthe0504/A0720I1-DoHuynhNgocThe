package Inheritance.Bai_tap.Point_MoveablePoint;

public class MoveablePoint extends Point {
    float xSpeed, ySpeed;


    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public float[] getSpeed() {
        float[] array = {getxSpeed(), getySpeed()};
        return array;
    }

    public String toString() {
        return "x, y: " + getX() + " , " + getY() + " speed " +" , " + getxSpeed() + " , " + getySpeed();
    }
    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 2, 2);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
