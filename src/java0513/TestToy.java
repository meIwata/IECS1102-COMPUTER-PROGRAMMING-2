package java0513;

import org.w3c.dom.ls.LSOutput;

// 第一代
class Animal {

    // 存取方法：父類別(嚴謹)，子類別(寬鬆)
    protected void makeSound() {

        System.out.println("動物發出叫聲");
    }
}

// 第二代
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

// 第三代
class SmallDog extends Dog {
    @Override
    public void makeSound() {
        super.makeSound(); // 呼叫父類別方法
        System.out.println("小聲汪汪");
    }
}

// Toy去叫Animal做事
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

        SmallDog smDog = new SmallDog();
        myToy.pressButton(smDog);
    }
}
