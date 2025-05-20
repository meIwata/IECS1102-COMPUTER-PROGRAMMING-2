package jave0515;

import java.util.Random;

public class Gym {
    // 傳入兩隻神起寶貝，讓其對戰
    // 贏家規則
    // 1. level高的贏
    // 2. 若level相同，則比較AttackPower - DefencePower的值
    // 3. 若2. 相同，則隨機選出一個贏家
    // 最後印出贏家的資訊

    // H.W. 用隨機的方式傳入兩隻神奇寶貝對戰

    public static void fight(Pokemon x, Pokemon y) {
        if (x.getLevel() > y.getLevel()) {
            System.out.println(x.getName() + "勝");
        } else if (x.getLevel() < y.getLevel()) {
            System.out.println(y.getName() + "勝");
        } else { // level 相同
            int xPower = x.attackPower - x.defencePower;
            int yPower = y.attackPower - y.defencePower;
            if (xPower > yPower) {
                System.out.println(x.getName() + "勝");
            } else if (xPower < yPower) {
                System.out.println(y.getName() + "勝");
            } else {
                // 隨機挑出 x 或 y
                String[] chosenArray = {x.getName(), y.getName()};
                Random random = new Random();
                int index = random.nextInt(2); // 產生一個 0 或 1 的隨機整數
                System.out.println(chosenArray[index] + "勝");

                // 老師的方法
                /*
                double random2 = Math.random(); // 0~1，不包含1
                if (random2 > 0.5) {
                    System.out.println(x.getName()+ "勝");
                }else{
                    System.out.println(y.getName() + "勝");
                }
                */
            }
        }
    }

    public static void main(String[] args) {
        Pokemon x = new Pickachu("皮卡丘");
        x.addCandy(100);
        x.levelUp();
        x.increaseAttackPower();
        x.increaseDefencePower();

        Pokemon y = new Bulbasaur("妙蛙種子");
        y.addCandy(100);
        y.levelUp();
        y.increaseAttackPower();
        y.increaseDefencePower();

        x.printInfo();
        y.printInfo();
        fight(x, y);
    }
}
