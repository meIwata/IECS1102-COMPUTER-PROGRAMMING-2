package java_0422;

import java_0415.IcCard;

public class CardArray {
    public static void main(String[] args) {
        IcCard[] manyCards = new IcCard[3];
        for (int i = 0; i < manyCards.length; i++) {
            manyCards[i] = new IcCard();
            manyCards[i].number = String.valueOf(0x336789AB + i);
            manyCards[i].balance = 100 + i * 123;
        }
        for(IcCard card: manyCards){
            card.printInfo();
        }
    }
}
