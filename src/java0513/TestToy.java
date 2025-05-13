package java0513;

class Animal {
    public void makeSound() {
        System.out.println("動物發出叫聲");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("汪汪");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("喵喵");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("哞哞");
    }
}

class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("呱呱");
    }
}

class Toy {
    public void pressButton(Animal animal) {
        animal.makeSound();
    }
}

public class TestToy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Toy myToy = new Toy();
        myToy.pressButton(dog);

        Cat cat = new Cat();
        myToy.pressButton(cat);

        Cow cow = new Cow();
        myToy.pressButton(cow);

        Duck duck = new Duck();
        myToy.pressButton(duck);
    }
}
