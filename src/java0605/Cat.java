package java0605;

interface Animal {
    void makeSound();

    void sleep();
}

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("喵喵");
    }

    @Override
    public void sleep() {
        System.out.println("喵喵正在睡覺");
    }

    public static void main(String[] args) {
        // 實作Cat類別
        Cat kitty = new Cat();
        kitty.makeSound();
        kitty.sleep();

        //----------------------------------

        // 建立一個實作 Animal 介面的匿名類別，並實作其方法
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Animal 匿名類別 的叫聲");
            }

            @Override
            public void sleep() {
                System.out.println("Animal 匿名類別 在睡覺");
            }
        };
        animal.makeSound();
        animal.sleep();
    }
}
