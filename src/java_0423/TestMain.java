package java_0423;

public class TestMain {
    public static void main(String[] args) {
        Dog dog = new Dog("旺仔");
        Parrot parrot = new Parrot("鳥仔");

        dog.sleep();
        dog.action1("跟其他狗打架!");
        System.out.println(dog.action2("跟其他狗打架!"));

    }
}