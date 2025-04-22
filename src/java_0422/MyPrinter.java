package java_0422;

import java_0415.IcCard;

public class MyPrinter {
    void printValue(int num) {
        num += 10;
        System.out.println("printValue方法: " + num);
    }

    void printIcCard(IcCard card) {
        card.balance += 10;
        card.printInfo();
    }
}
