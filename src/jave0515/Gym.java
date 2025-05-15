package jave0515;

public class Gym {
    // 傳入兩隻神起寶貝，讓其對戰
    // 贏家規則
    // 1. level高的贏
    // 2. 若level相同，則比較AttackPower - DefencePower的值
    // 3. 若2. 相同，則隨機選出一個贏家
    // 最後印出贏家的資訊

    // H.W. 用隨機的方式傳入兩隻神奇寶貝對戰

    public static void fight(Pickachu pickachu, Bulbasaur bulbasaur) {
        if (pickachu.getLevel() > bulbasaur.getLevel()) {
            System.out.println(pickachu.getName() + "勝");
        } else  {
            System.out.println(bulbasaur.getName() + "勝");
        }
    }

    public static void main(String[] args) {
        Pickachu pickachu = new Pickachu("皮卡丘");
        Bulbasaur bulbasaur = new Bulbasaur("妙蛙種子");
        fight(pickachu, bulbasaur);
    }

}
