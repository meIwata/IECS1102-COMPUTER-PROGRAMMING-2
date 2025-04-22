package java_0422;

import java_0415.IcCard;

public class Test_03 {
    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();
        int num = 5;

        printer.printValue(num); // 呼叫把printValue方法，把num = 5 傳到方法裡

        System.out.println("Test_03裡面的: " + num);

        IcCard myCard = new IcCard();
        myCard.number = "D111";
        myCard.balance = 100;
        myCard.printInfo();

        printer.printIcCard(myCard);
        myCard.printInfo();
    }
}
