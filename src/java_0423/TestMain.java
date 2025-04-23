package java_0423;

public class TestMain {
    public static void main(String[] args) {
        // 狗
        Dog dog = new Dog("旺仔");
        dog.sleep();
        dog.action1("跟其他狗打架!");
        System.out.println(dog.action2("跟其他人要東西吃!"));
        dog.walk();
        dog.makeSound();
        dog.eat();
        dog.wagTail();
        dog.fetchBone();
        dog.perform();
        dog.name = "小白";
        System.out.println("旺仔已經改名成" + dog.name + "了!!!");
        System.out.print(dog.name + " 說");
        dog.showWalkingStyle();

        System.out.println("---------------------------------------");

        //鳥
        Parrot parrot = new Parrot("鳥仔");
        parrot.sleep();
        parrot.action1("飛來飛去");
        System.out.println(parrot.action2("逗")+ dog.name);
        parrot.fly();
        parrot.perform();

    }
}