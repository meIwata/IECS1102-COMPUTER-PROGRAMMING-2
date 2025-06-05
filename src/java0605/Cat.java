package java0605;

interface Animal {
    void makeSound();

//    void sleep();
}

class Toy {
    public void pressButton(Animal animal) {
        animal.makeSound();
    }
}

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("喵喵");
    }

//    @Override
//    public void sleep() {
//        System.out.println("喵喵正在睡覺");
//    }

    public static void main(String[] args) {
        // 實作Cat類別
        Cat kitty = new Cat();
        kitty.makeSound();
//        kitty.sleep();

        //----------------------------------

        // 建立一個實作 Animal 介面的匿名類別，並實作其方法
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("匿名類別1 的叫聲");
            }

//            @Override
//            public void sleep() {
//                System.out.println("匿名類別2 在睡覺");
//            }
        };
        animal.makeSound();
//        animal.sleep();

        //----------------------------------

        Toy toy = new Toy();
        // 傳入 Cat 物件，呼叫 pressButton，會呼叫 Cat 的 makeSound()
        toy.pressButton(kitty); // 印出 "喵喵"
//        toy.pressButton(new Animal() {
//
//            @Override
//            public void makeSound() {
//                System.out.println("匿名類別2 的叫聲");
//            }
//
//            @Override
//            public void sleep() {
//                System.out.println("匿名類別2 在睡覺");
//            }
//        });

        // 使用lambda語法
        toy.pressButton(() -> {
            System.out.println("匿名類別2 的叫聲");
        });


        animal.makeSound();
//        animal.sleep();
    }
}
