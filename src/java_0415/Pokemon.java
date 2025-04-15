package java_0415;

public class Pokemon {
    //成員變數
    String name;
    int cp;
    int hp;
    int candy;

    //成員方法
    void powerUp() {
        cp = cp + 10;
        candy = candy - 5;
    }

    void evolve() {
        cp = cp + 50;
        candy = candy - 15;
    }

    void printInfo() {
        System.out.println("name: " + name + " ,cp: " + cp + " ,hp: " + hp + " ,candy: " + candy);
    }
}

