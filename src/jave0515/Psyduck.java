package jave0515;

public class Psyduck {
    // 成員變數
    private String name;
    private int level;
    private int candy;
    private int attackPower;
    private int defencePower;

    public Psyduck(String name) {
        this.name = name;
        this.candy = 0;
        this.level = 4 + (int) (Math.random() * 3); //4~6
        this.attackPower = 1 + (int) (Math.random() * 5);
        ; //1~5
        this.defencePower = 6 + (int) (Math.random() * 5); //6~10

    }

    // 增加candy的數
    public void addCandy(int candy) {
        this.candy += candy;
    }

    // 增加attackPower
    // 花費2個candy可以增加1個attackPower
    public void increaseAttackPower() {
        if (candy >= 2) {
            candy -= 2;
            attackPower += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    // 增加defencePower
    // 花費1個candy可以增加2個defencePower
    public void increaseDefencePower() {
        if (candy >= 1) {
            candy -= 1;
            defencePower += 2;
        } else {
            System.out.println("糖果數不足");
        }
    }

    // 增加level
    // 花費20個candy可以增加1個level
    public void levelUp() {
        if (candy >= 20) {
            candy -= 20;
            level += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    // 針對所有成員變數提供get方法

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getCandy() {
        return candy;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    // 印出所有成員變數得值
    public void printInfo() {
        System.out.println("Psyduck{" +
                "姓名='" + name + '\'' +
                ", 等級=" + level +
                ", 糖果=" + candy +
                ", 攻擊力=" + attackPower +
                ", 防禦力=" + defencePower +
                '}');
    }

    public static void main(String[] args) {
        Psyduck psyduck = new Psyduck("鴨賞");
        psyduck.printInfo();
        psyduck.addCandy(20);
        psyduck.printInfo();
        psyduck.increaseAttackPower();
        psyduck.increaseDefencePower();
        psyduck.printInfo();
    }
}
