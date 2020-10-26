package Abstract_Interface.Bai_tap;

public class Square extends Rectangle{
    public Square() {

    }

    public Square(String color, double side) {
        super(color, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Hinh vuong co canh = "
                + getSide() + " "
                + "Hinh vuong co mau : "
                + getColor();
    }
    @Override
    public void resize(double percent) {
        this.setSide( this.getSide() + (this.getSide() * percent));
    }
}
