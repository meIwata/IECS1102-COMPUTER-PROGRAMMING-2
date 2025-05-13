package java0513;

public class TestToy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Toy myToy = new Toy();
        myToy.pressButton(dog);

        Cat cat = new Cat();
        myToy.pressButton(cat);

        Cow cow = new Cow();
        myToy.pressButton(cow);

    }
}
