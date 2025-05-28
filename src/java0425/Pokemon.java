package java0425;

public class Pokemon {
    // 成員變數(有效範圍在整個類別)
    String name;
    int level;
    int cp;
    int hp;
    int candy;

    // 有回傳值的成員方法
    int powerUp() {
        int cp = 50; //區域變數
        candy -= 5;
        this.cp += 20; // this.cp指的是成員變數的cp

        //System.out.println(cp); // 這裡的cp指的是區域變數的int cp = 20;

        /*
        int newCp = cp; //newCp為區域變數: 只在powerUp()裡面有效
        return newCp;
        */
        System.out.println(cp);
        return cp;
    }

    // 無回傳值的成員方法
    void printCpValue() {
        System.out.println(cp);
        System.out.println(this.cp); // this.XXX代表是成員變數
    }

    // 有回傳值的成員方法
    int evlove() {
        candy -= 20;
        cp += 50;
        level++;
//        System.out.println(newCp);
        return level;
    }

    // 有回傳值的成員方法
    int addCandy(int newCandy) {
        candy += newCandy;
        return candy;
    }
}
