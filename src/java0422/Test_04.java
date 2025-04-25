package java0422;

import java0415.IcCard;

public class Test_04 {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        IcCard[] myCards = new IcCard[3];
        for (int i = 0; i < myCards.length; i++) {
            myCards[i] = new IcCard(); // 把陣列裡每一個元素去new
            myCards[i].balance = i * 10;
            System.out.println(myCards[i].balance);
        }
    }
}
