package Abstract_Interface.Thuc_hanh.animal;

import Abstract_Interface.Thuc_hanh.animal.animal.Animal;
import Abstract_Interface.Thuc_hanh.animal.animal.Chicken;
import Abstract_Interface.Thuc_hanh.animal.animal.Tiger;
import Abstract_Interface.Thuc_hanh.animal.edible.Edible;
import Abstract_Interface.Thuc_hanh.animal.fruit.Apple;
import Abstract_Interface.Thuc_hanh.animal.fruit.Fruit;
import Abstract_Interface.Thuc_hanh.animal.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Fruit() {
            @Override
            public String howToEat() {
                return null;
            }
        };
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
