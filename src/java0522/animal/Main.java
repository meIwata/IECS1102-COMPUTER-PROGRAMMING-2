package java0522.animal;

public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy();

//        因為Animal父類別有抽象方法，所以不能實作
//        Animal animal = new Animal();
//        toy.pressButton(animal);


        Cat cat = new Cat();
        toy.pressButton(cat);

        Dog dog = new Dog();
        toy.pressButton(dog);

//        因為Cow類別有抽象方法，所以不能實作
//        Cow cow = new Cow();
//        cow.makeSound();

        LittleCow littleCow = new LittleCow();
        littleCow.makeSound();
    }
}
