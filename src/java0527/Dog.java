package java0527;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("汪汪");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在睡覺");
    }
}
