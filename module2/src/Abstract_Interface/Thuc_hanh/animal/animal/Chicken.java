package Abstract_Interface.Thuc_hanh.animal.animal;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

//    @Override
    public String howToEat() {
        return "could be fried";
    }
}
