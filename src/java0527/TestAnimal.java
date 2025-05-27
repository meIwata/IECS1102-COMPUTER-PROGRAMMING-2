package java0527;

public class TestAnimal {
    public static void main(String[] args) {
        Toy toy = new Toy();

//        因為是介面不能被實做
//        Animal animal = new Animal();

        Cat cat = new Cat();
        toy.pressButton(cat);
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        toy.pressButton(dog);
        dog.makeSound();
        dog.sleep();
    }
}
