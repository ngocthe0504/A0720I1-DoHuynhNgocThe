package Object.Bai_Tap.systemTime;

public class SystemTime {
    double starTime, stopTime;
    public void  start() {
        this.starTime = System.currentTimeMillis();
    }
    public void  stop() {
        this.stopTime = System.currentTimeMillis();;
    }
    public double getElapsedTime() {
        return (this.stopTime - this.starTime);
    }
}
