package java0521;

// 自訂義類別
class Eye {
    String color;

    public Eye(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}

class Mouse {
    String mouseSize;

    public Mouse(String mouseSize) {
        this.mouseSize = mouseSize;
    }

    @Override
    public String toString() {
        return mouseSize;
    }
}

class Nose {
    String color;

    public Nose(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}

class Annimal {
    Eye eyes;
    Mouse mouse;
    Nose nose;

    void eat() {

    }
}

class Dog extends Annimal {
    String name;

    void collectInfo(String name, Eye eyes, Mouse mouse, Nose nose) {
        this.name = name;
        this.eyes = eyes;
        this.mouse = mouse;
        this.nose = nose;
    }

    String bark() {
        return "汪汪";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", eyes=" + eyes +
                ", mouse=" + mouse +
                ", nose=" + nose +
                '}';
    }
}

class GoldenRetriever extends Dog {
    @Override
    String bark() {
        return name + super.bark() + "叫";
    }

    @Override
    void eat() {
        System.out.println(name + "吃很多");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.collectInfo("金塊", new Eye("褐色"), new Mouse("黑色"), new Nose("大"));
        System.out.println(goldenRetriever.toString());
        System.out.println(goldenRetriever.bark());
        goldenRetriever.eat();
    }
}
