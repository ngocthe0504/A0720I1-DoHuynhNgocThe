package Abstract_Interface.Bai_tap;

import Abstract_Interface.Bai_tap.Interface.Resizeable;

public abstract class Figure implements Resizeable {
    private String color = "blue";

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Hinh co mau: "
                + getColor() + " ";
    }

    public abstract void resize(double percent);
}
