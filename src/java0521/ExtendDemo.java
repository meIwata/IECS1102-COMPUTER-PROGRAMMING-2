package java0521;

class Parent {
    public Parent() {
        System.out.println("父類別");
    }
}

class Child {
    public Child() {
        System.out.println("子類別");
    }
}

public class ExtendDemo {
    public static void main(String[] args) {
        Child child = new Child(); // 可以重複使用這個物件，之後還能操作這個物件
        new Child(); // 沒有保存參考，物件很快會消失。
    }
}
