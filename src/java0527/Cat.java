package java0527;

public class Cat implements Animal {
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


