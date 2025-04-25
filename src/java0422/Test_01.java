package java0422;

import java0415.IcCard;

public class Test_01 {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 15;
        System.out.println("a: " + a + ";b: " + b);

        b = a;
        System.out.println(a == b); //比較a、b的值

        b = 25;
        System.out.println(a == b);
        // System.out.println("a: " + a + ";b: " + b);

        */


        IcCard myCard = new IcCard();
        myCard.number = "D111";
        myCard.balance = 100;
        System.out.print("myCard ");
        myCard.printInfo();

        IcCard yourCard = new IcCard();
        yourCard.number = "D111";
        yourCard.balance = 100;
        System.out.print("yourCard ");
        yourCard.printInfo();
        System.out.println(myCard == yourCard); // 兩個記憶體空間位置不一樣所以是false

        yourCard = myCard; // 已經把myCard的參照記憶體給yourCard，兩個都是指向同一個地方
        System.out.print("yourCard ");
        yourCard.printInfo();
        System.out.println(myCard == yourCard); // 兩個記憶體空間位置一樣所以是true
        System.out.print("myCard ");
        myCard.printInfo();

        System.out.println("-----------------------------");

        yourCard.number = "D333";
        yourCard.balance = 1000;
        System.out.print("myCard ");
        myCard.printInfo();
        System.out.print("yourCard ");
        yourCard.printInfo();

        myCard = null; // 設定成null就沒有指到任何物件 (NullPointerException)

    }
}
