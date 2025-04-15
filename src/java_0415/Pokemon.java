package java_0415;

public class Pokemon {
    String name;
    int cp;
    int hp;
    int candy;

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

