package Object.Bai_Tap.Fan;


public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getString() {
        if (this.isOn()) {
            System.out.println("Speed = "+this.getSpeed()+" Color: "+this.getColor()+" Radius: "+this.getRadius()+" fan is on");
        } else {
            System.out.print("Speed = "+this.getSpeed()+" Radius: "+this.getRadius()+" fan is off");
        }
    }
}
