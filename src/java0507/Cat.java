package java0507;

public class Cat {
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String name, String color, int count) {
        this.name = name;
        this.color = color;
        this.count = count;
    }

    int count = 0;

    public void mouseCatch() {
        count++;
        System.out.println("抓到" + count + "隻老鼠了");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "名字: '" + name + '\'' +
                ", 花色: '" + color + '\'' +
                ", 老鼠抓了 " + count + "隻" +
                '}';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("有喜", "黑白色");
        cat1.mouseCatch();
        cat1.mouseCatch();
        System.out.println(cat1.toString());

        Cat cat2 = new Cat("小吉", "黑色");
        cat2.mouseCatch();
        cat2.mouseCatch();
        cat2.mouseCatch();
        System.out.println(cat2.toString());
    }
}
