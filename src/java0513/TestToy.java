package java0513;

class Dog {
    public void makeSound() {
        System.out.println("汪汪");
    }
}

class Cat {
    public void makeSound() {
        System.out.println("喵喵");
    }
}

class Cow {
    public void makeSound() {
        System.out.println("哞哞");
    }
}

class Toy {
    public void pressButton(Dog dog) {
        dog.makeSound();
    }

    public void pressButton(Cat cat) {
        cat.makeSound();
    }

    public void pressButton(Cow cow) {
        cow.makeSound();
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
    }
}
