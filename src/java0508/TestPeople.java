package java0508;

public class TestPeople {
    public static void main(String[] args) {
        Person tom = new Person("A123456789", "Tom");
        tom.eat();
        tom.sleep();

        Person mary = new Person();
//        Person mary = new Person("","");
        mary.eat(); // null正要去吃東西！
        mary.sleep(); //null正要去吃睡覺！
        /*使用的是空參數建構子，name的型別是String預設就是null*/
        System.out.println("----------------");

        Student john = new Student("B123456789", "John", "D123456789");
        john.eat(); // Student裡面有個覆寫的方法
        john.sleep();

        // 第一種getName() 方法
        john.takeCourse();
        john.joinParty();

        // 第二種getName() 方法
//        john.takeCourse(john.getName());
//        john.joinParty(john.getName());
        System.out.println(john.getName());

        MasterStudent sandy = new MasterStudent("C123456789", "Sandy", "M12345");
        sandy.sleep();
        sandy.takeCourse();
        sandy.doResearch();


        /*碩士生是一個學生*/
        /*向上轉型從MasterStudent子類別變成Student父類別*/
        Person kelly = new MasterStudent("C0022339", "Kelly", "M123655");
        kelly.sleep();
        kelly.eat(); // kelly已經變成Student父類別，但因為原本子類別MasterStudent的void eat()已經覆寫了，所以會使用覆寫的方法
//        kelly.takeCourse(); // 愈往上轉型，子類別能力消失
//        kelly.doResearch(); // 現在kelly已經轉成父類別了，就沒有子類別的功能

        System.out.println("----------------");


        /*向下轉型 kelly原本是Person，現在變成MasterStudent，向下轉型有風險，可能會轉錯*/
        MasterStudent masterStudent = (MasterStudent) kelly;
        masterStudent.doResearch();

        System.out.println("----------------");
        Restaurant fcuRest = new Restaurant();
        fcuRest.offeringLunch(tom);
        fcuRest.offeringLunch(kelly); // kelly已經變成Student父類別，但因為原本子類別MasterStudent的void eat()已經覆寫了，所以會使用覆寫的方法
    }
}
