package java_0423;

public abstract class AbstractFourLeggedAnimal extends Animal {
    AbstractFourLeggedAnimal(String name) {
        super(name);
        this.name = name;
    }

    abstract void walk();

    abstract void makeSound();

    void eat() {
        System.out.println(name + " 在吃東西！");
    }
}
