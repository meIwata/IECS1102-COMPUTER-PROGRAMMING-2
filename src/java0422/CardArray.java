package java0422;

import java0415.IcCard;


// 課本案例8-13
public class CardArray {
    public static void main(String[] args) {
        IcCard[] manyCards = new IcCard[3];
        for (int i = 0; i < manyCards.length; i++) {
            manyCards[i] = new IcCard();
            manyCards[i].number = String.valueOf(0x336789AB + i);
            manyCards[i].balance = 100 + i * 123;
            manyCards[i].printInfo(); // 列印出資料
        }

        System.out.println();

        // 增強型for迴圈
        for(IcCard card: manyCards){
            card.printInfo();
        }
    }
}
