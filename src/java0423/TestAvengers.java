package java0423;

// 介面，英雄的基本行為
interface HeroAction {
    void attack();

    void defend();
}

// 抽象類別
abstract class Avenger implements HeroAction {
    protected String name;

    // 建構子
    Avenger(String name) {
        this.name = name;
    }

    // 非抽象具體方法，可有實作，也可被 override
    void assemble() {
        System.out.println(name + " 正在集合復仇者聯盟!");
    }

    // 抽象方法：特殊能力，由子類別實作
    abstract void specialAbility();
}

// 具體類別：鋼鐵人
class IronMan extends Avenger {
    IronMan() {
        super("鋼鐵人");
    }

    @Override
    public void attack() {
        System.out.println(name + " 發射了能量炮!");
    }

    @Override
    public void defend() {
        System.out.println(name + " 啟用了能量護盾!");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " 使用了人工智慧驅動的裝甲升級!");
    }
}

// 具體類別：雷神索爾
class Thor extends Avenger {
    Thor() {
        super("雷神索爾");
    }

    @Override
    public void attack() {
        System.out.println(name + " 使用雷神之鎚，釋放雷電!");
    }

    @Override
    public void defend() {
        System.out.println(name + " 使用雷神之鎚進行防禦!");
    }

    @Override
    void assemble() {
        System.out.println(name + " 呼喚洛基!");
    }

    @Override
    void specialAbility() {
        System.out.println(name + " 呼喚彩虹橋進行傳送!");
    }
}

// 具體類別：黑寡婦
class BlackWidow extends Avenger {
    BlackWidow() {
        super("黑寡婦");
    }

    @Override
    public void attack() {
        System.out.println(name + " 使用武術進行攻擊！");
    }

    @Override
    public void defend() {
        System.out.println(name + " 靈活地閃避攻擊！");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " 使用潛行與駭客技能！");
    }
}

public class TestAvengers {
    public static void main(String[] args) {
        // 使用多型 (Polymorphism)
        Avenger[] avengers = {new IronMan(), new Thor(), new BlackWidow()};
        
        for (Avenger avenger : avengers) {
            avenger.assemble();
            avenger.attack();
            avenger.defend();
            avenger.specialAbility();
            System.out.println();
        }
    }
}
