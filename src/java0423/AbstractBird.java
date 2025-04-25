package java0423;

public abstract class AbstractBird extends Animal {
    AbstractBird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    void perform() { // 不要加 `abstract`，這樣它會有實現
        System.out.println(name + " 在表演");
    }
}
