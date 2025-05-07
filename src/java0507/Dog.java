package java0507;

public class Dog {
    String name;
    String Color;
    String voice;

    public Dog(String name, String color, String voice) {
        this.name = name;
        Color = color;
        this.voice = voice;
    }
    public void call(){
        System.out.println(voice);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("小白", "白色","汪汪汪");
        System.out.println(dog1.name + "的顏色是"  + dog1.Color + "，聲音" + dog1.voice);
        dog1.call();

        Dog dog2 = new Dog("小黑", "黑色","嗷嗚");
        System.out.println(dog2.name + "的顏色是"  + dog2.Color + "，聲音" + dog2.voice);
        dog2.call();
    }
}
