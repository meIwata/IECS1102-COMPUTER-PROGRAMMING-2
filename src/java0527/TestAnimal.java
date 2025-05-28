package java0527;

interface Animal {
    void makeSound();

    void sleep();
}

class Toy {
    public void pressButton(Animal animal) {
        animal.makeSound();
    }
}

class Cat implements Animal {
    // 要實作所有介面的方法，要不然自己變成抽象(只實做一個也需要變成抽象類別)
    @Override
    public void makeSound() {
        System.out.println("喵喵");
    }

    @Override
    public void sleep() {
        System.out.println("喵喵在睡覺");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("汪汪");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在睡覺");
    }
}


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
