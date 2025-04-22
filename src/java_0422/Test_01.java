package java_0422;

import java_0415.IcCard;

public class Test_01 {
    public static void main(String[] args) {
        IcCard myCard = new IcCard();
        myCard.number = "D111";
        myCard.balance = 100;
        System.out.print("myCard ");
        myCard.printInfo();

        IcCard yourCard = new IcCard();
        yourCard.number = "D222";
        yourCard.balance = 300;
        System.out.print("yourCard ");
        yourCard.printInfo();

        yourCard = myCard; // 已經把myCard的參照記憶體給yourCard，兩個都是指向同一個地方
        System.out.print("yourCard ");
        yourCard.printInfo();
        System.out.print("myCard ");
        myCard.printInfo();

        System.out.println("-----------------------------");

        yourCard.number = "D333";
        yourCard.balance = 1000;
        System.out.print("myCard ");
        myCard.printInfo();
        System.out.print("yourCard ");
        yourCard.printInfo();

        /*
        int a = 10;
        int b = 15;
        System.out.println("a: " + a + ";b: " + b);

        b = a;

        b = 25;
        System.out.println("a: " + a + ";b: " + b);
        */
    }
}
