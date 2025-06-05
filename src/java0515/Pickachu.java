package java0515;

public class Pickachu extends Pokemon {

    public Pickachu(String name) {
        super(name, 0, Pokemon.getRandonValue(4, 6), Pokemon.getRandonValue(6, 10), Pokemon.getRandonValue(1, 5));
    }

    @Override
    public void increaseAttackPower() {
        if (candy >= 1) {
            candy -= 1;
            attackPower += 2;
        } else {
            System.out.println("糖果數不足");
        }
    }

    @Override
        public void increaseDefencePower() {
        if (candy >= 2) {
            candy -= 2;
            defencePower += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    public void levelUp() {
        super.levelUp();
    }

//    private String name;
//    private int level;
//    private int candy;
//    private int attackPower;
//    private int defencePower;
//
//    public Pickachu(String name) {
//        this.name = name;
//        this.candy = 0;
//        this.level = 4 + (int) (Math.random() * 3); // 4~6
//        /*
//        *   Math.random() => 0~0.99
//        *   *3 = 0~2.999...
//        *   +4 = 4~6.999...
//        */
//
//        this.attackPower = 6 + (int) (Math.random() * 5); //6~10
//        /*
//         *  Math.random() => 0~0.99
//         *  *5 = 0~4.999...
//         *  +6 = 6~10.999...
//        */
//        this.defencePower = 1 + (int) (Math.random() * 5); //1~5
//        /*
//         *  Math.random() => 0~0.99
//         *  *5 = 0~4.999...
//         *  +1 = 1~5.999...
//        */
//    }
//
//    // 增加candy的數
//    public void addCandy(int candy) {
//        this.candy += candy;
//    }
//
//    // 增加attackPower
//    // 花費1個candy可以增加2個attackPower
//    public void increaseAttackPower() {
//        if (candy >= 1) {
//            candy -= 1;
//            attackPower += 2;
//        } else {
//            System.out.println("糖果數不足");
//        }
//    }
//
//    // 增加defencePower
//    // 花費2個candy可以增加1個defencePower
//    public void increaseDefencePower() {
//        if (candy >= 2) {
//            candy -= 2;
//            defencePower += 1;
//        } else {
//            System.out.println("糖果數不足");
//        }
//    }
//
//    // 增加level
//    // 花費20個candy可以增加1個level
//    public void levelUp() {
//        if (candy >= 20) {
//            candy -= 20;
//            level += 1;
//        } else {
//            System.out.println("糖果數不足");
//        }
//    }
//
//    // 針對所有成員變數提供get方法
//
//    public String getName() {
//        return name;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    public int getCandy() {
//        return candy;
//    }
//
//    public int getAttackPower() {
//        return attackPower;
//    }
//
//    public int getDefencePower() {
//        return defencePower;
//    }
//
//    // 印出所有成員變數得值
//    public void printInfo() {
//        System.out.println("Pickachu{" +
//                "姓名='" + name + '\'' +
//                ", 等級=" + level +
//                ", 糖果=" + candy +
//                ", 攻擊力=" + attackPower +
//                ", 防禦力=" + defencePower +
//                '}');
//    }
}

