package Object.Bai_Tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.speed = fan1.getSLOW();
        fan1.on = true;
        fan1.radius = 10;
        fan1.color = "Yewllo";
        fan2.speed = fan2.getMEDIUM();
        fan2.on = false;
        fan2.radius = 5;
        fan1.color = "Blue";
        fan1.getString();
        fan2.getString();
    }
}
