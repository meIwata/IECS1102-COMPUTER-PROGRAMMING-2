package java0508;

public class TestPeople {
    public static void main(String[] args) {
        Person tom = new Person("A123456789", "Tom");
        tom.eat();
        tom.sleep();

        Person mary = new Person();
        mary.eat(); // null正要去吃東西！
        mary.sleep(); //null正要去吃睡覺！
        /*使用的是空參數建構子，name的型別是String預設就是null*/

        Student john = new Student("B123456789", "John", "D123456789");
        john.sleep();
        john.takeCourse();
        john.joinParty();
    }
}
