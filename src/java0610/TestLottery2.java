package java0610;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class LotteryGenerator2 {
    // 從1到所指定的maxValue(例如100)間，取出numbers個樂透號碼
    // 例如: maxValue = 100，numbers = 5，從1~100間隨機取出5個號碼，這5號碼都不能重複
    public static Set<Integer> generateLotteryNumbers(int maxValue, int numbers) {
        HashSet<Integer> lotteryNumbers = new HashSet<Integer>();
        Random random = new Random();
        random.nextInt(maxValue);

        // 如果抽出來未達5個就繼續抽
        while (lotteryNumbers.size() < numbers) {
            lotteryNumbers.add(random.nextInt(maxValue) + 1); // 0~99 + 1 => 1~100
        }

//        for (int i = 0; i < numbers; i++) {
//            lotteryNumbers.add(random.nextInt(maxValue) + 1); // 0~99 + 1 => 1~100
//        }
        return lotteryNumbers;
    }
}

public class TestLottery2 {
    public static void main(String[] args) {
        LotteryGenerator2 lotteryGenerator = new LotteryGenerator2();
        System.out.println(lotteryGenerator.generateLotteryNumbers(100, 5));
    }
}
