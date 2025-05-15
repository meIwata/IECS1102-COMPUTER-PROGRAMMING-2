package jave0515;

public class Pokemon {
    // 成員變數
    private String name;
    protected int level;
    protected int candy;
    protected int attackPower;
    protected int defencePower;

    // 建構子
    public Pokemon(String name) {
        this.name = name;
    }

    public Pokemon(String name, int level, int candy, int attackPower, int defencePower) {
        this.name = name;
        this.level = level;
        this.candy = candy;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public void addCandy(int candy) {
        this.candy += candy;
    }

    // 提供方法，但不實做
    public void increaseAttackPower() {

    }

    public void increaseDefencePower() {

    }

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
        System.out.println(getName() +
                "姓名='" + name + '\'' +
                ", 等級=" + level +
                ", 糖果=" + candy +
                ", 攻擊力=" + attackPower +
                ", 防禦力=" + defencePower +
                '}');
    }

    protected static int getRandonValue(int start, int end) {
        int range = end - start + 1;
        int randomValue = start + (int) (Math.random() * range);
        return randomValue;
    }
}
