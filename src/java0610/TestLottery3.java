package java0610;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LotteryGenerator3 {
    public static List<Integer> generateLotteryNumbers(int maxValue, int numbers) {
//        List<Integer> bag = new ArrayList<Integer>();
        List<Integer> bag = new LinkedList<Integer>(); // LinkedList
        while (bag.size() < numbers) {
            int randomNumber = (int) (Math.random() * maxValue) + 1;
            System.out.println(randomNumber);
            bag.add(randomNumber);
        }
        return bag;
    }
}

public class TestLottery3 {
    public static void main(String[] args) {
        List<Integer> bag = LotteryGenerator3.generateLotteryNumbers(8, 5);

        System.out.println("印出隨機號碼： ");

        for (int i = 0; i < bag.size(); i++) {
            System.out.println(bag.get(i));
        }
    }
}
