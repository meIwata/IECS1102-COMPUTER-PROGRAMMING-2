package java0522.animal;

public class LittleCow extends Cow {
    public LittleCow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("小牛哞哞");
    }
}
