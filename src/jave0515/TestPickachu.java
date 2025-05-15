package jave0515;

class Pickachu {
    // 成員變數
    String name;
    int level;
    int candy;
    int attackPower;
    int defencePower;

    public Pickachu(String name) {
        this.name = name;
        candy = 0;
        level = 4 + (int) (Math.random() * 3); // Math.random()=> 0~1
        attackPower = 6 + (int) (Math.random() * 5);
        defencePower = 1 + (int) (Math.random() * 5);

    }

    // 增加candy的數
    public void addCandy(int candy) {
        candy += 1;
    }

    // 增加attackPower
    // 花費1個candy可以增加2個attackPower
    public void increaseAttackPower() {
        if (candy >= 1) {
            candy -= 1;
            attackPower += 2;
        } else {
            System.out.println("糖果數不足");
        }
    }


    // 增加defencePower
    // 花費2個candy可以增加1個defencePower
    public void increaseDefencePower() {
        if (candy >= 2) {
            candy -= 2;
            defencePower += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    // 增加level
    // 花費20個candy可以增加1個level
    public void powerUp() {
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
        System.out.println("Pickachu{" +
                "姓名='" + name + '\'' +
                ", 等級=" + level +
                ", 糖果=" + candy +
                ", 攻擊力=" + attackPower +
                ", 防禦力=" + defencePower +
                '}');
    }
}


public class TestPickachu {
    public static void main(String[] args) {
        Pickachu one = new Pickachu("可達鴨");
        one.printInfo();
    }
}
