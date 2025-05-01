package java0501;

public class Pokemon {
    // 成員變數如下
    // name, cp, hp, candy

    private String name;
    private int cp;
    private int hp;
    private int candy;
    // 所有成員變數的存取修飾值為private

    // ⚠️重點⚠️ 有static就是共用的，只有一份
    static int ONE = 1;

    // 定義建構方法 1 public
    // 沒有參數
    Pokemon() {

    }

    // 定義建構方法 2 public
    // 讓呼叫者對所有成員變數指定初始值
    Pokemon(String name, int cp, int hp, int candy) {
        this.name = name;
        this.cp = cp;
        this.hp = hp;
        this.candy = candy;
    }

    // 定義每一個成員變數的Getter & Setter方法
    // 方法都為public

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCp() {
        ONE++; // 一般方法也可以存取靜態變數
//        Pokemon.ONE ++; // 這樣寫也可以

        printString("Hey!"); // 一般方法也可以呼叫靜態方法
//        Pokemon.printString("Hey!"); // 這樣寫也可以

        return cp;
    }

    public void setCp(int cp) {
        if (cp >= 0) {
            this.cp = cp;
        } else {
            System.out.println("輸入值需大於0");
        }

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        } else {
            System.out.println("輸入值需大於0");
        }
    }

    public int getCandy() {
        return candy;
    }

    public void setCandy(int candy) {
        if (candy >= 0) {
            this.candy = candy;
        } else {
            System.out.println("輸入值需大於0");
        }
    }

    // 定義一個static的printString(String input)方法
    // 印出所有輸入的字串
    public static void printString(String input) {
        System.out.println(input);


        // ⚠️重點⚠️ 不可在靜態方法去存取一般的成員變數
//        cp += 100;
        ONE += 100; // 靜態方法可以存取一般的成員變數
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", cp=" + cp +
                ", hp=" + hp +
                ", candy=" + candy +
                '}';
    }
}
