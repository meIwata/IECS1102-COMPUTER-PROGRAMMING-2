package java0423;

public class Parrot extends AbstractBird implements Flyable, Performable {
    Parrot(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(name + "正在飛翔～");
    }

    @Override
    public void perform(){
        System.out.println(name + "正在唱歌♬");
    }
}
