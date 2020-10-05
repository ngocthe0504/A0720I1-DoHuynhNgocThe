package Object.Bai_Tap.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1.0,3,1);
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("nghiem thu 1: "+quadraticEquation.getRoot1());
            System.out.print("nghiem thu 2: "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("nghiem kep: "+quadraticEquation.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}
