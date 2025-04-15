package java_0415;

public class Pokemon {
    //成員變數
    String name;
    int cp;
    int hp;
    int candy;

    //成員方法
    void powerUp() {
        if (candy >= 5) {
//            cp = cp + 10;
            cp += 10;
//            candy = candy - 5;
            candy -= 5;
        } else {
            System.out.println("現有糖果: " + candy + "，糖果不足5顆！，不可以升級！");
        }

    }

    void evolve() {
        if (candy >= 15) {
//            cp = cp + 50;
            cp += 50;
//            candy = candy - 15;
            candy -= 15;
        } else {
            System.out.println("現有糖果: " + candy + "，糖果不足15顆！，不可以進化！");
        }

    }

    void printInfo() {
        System.out.println("name: " + name + " ,cp: " + cp + " ,hp: " + hp + " ,candy: " + candy);
    }
}

