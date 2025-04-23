package java_0423;

public class Dog extends AbstractFourLeggedAnimal implements Walkable, Performable {
    Dog(String name) {
        super(name);
    }

    /*是父類別抽象方法的實作*/
    @Override
    public void walk() {
        System.out.println(name + " 正在散步中 🐾");
    }

    @Override
    void makeSound() {
        System.out.println(name + " 正在吠叫");
    }

    @Override
    void eat() {
        super.eat(); // 呼叫父類別已經寫好的 eat 方法
        System.out.println(name + " 吃得津津有味！");
    }

    // 自訂的方法
    void wagTail() {
        System.out.println(name + " 搖尾巴");
    }

    void fetchBone() {
        System.out.println(name + " 拿了一根骨頭");
    }

    @Override
    public void perform() {
        System.out.println(name + " 在表演跳火圈！");
    }
}
