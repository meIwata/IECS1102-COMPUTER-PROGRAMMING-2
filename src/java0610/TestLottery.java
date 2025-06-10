package java0610;

import java.util.*;

class LotteryGenerator {
    // 從1到所指定的maxValue(例如100)間，取出numbers個樂透號碼
    // 例如: maxValue = 100，numbers = 5，從1~100間隨機取出5個號碼，這5號碼都不能重複
    public static Set<Integer> generateLotteryNumbers(int maxValue, int numbers) {
//        HashSet<Integer> lotteryNumbers = new HashSet<Integer>();
//        Random random = new Random();
//        random.nextInt(maxValue);
//        for (int i = 0; i < numbers; i++) {
//            lotteryNumbers.add(random.nextInt(maxValue) + 1); // 0~99 + 1 => 1~100
//        }
//        return lotteryNumbers;


        /*老師解法*/
//        Set<Integer> bag = new HashSet<Integer>();
//        Set<Integer> bag = new LinkedHashSet<>(); // 保證放進去，拿出來順序相同
        Set<Integer> bag = new TreeSet<>(); // 由小排到大
        while (bag.size() < numbers) {
            int randomNumber = (int) (Math.random() * maxValue) + 1;
            System.out.println(randomNumber);
            bag.add(randomNumber);
        }

//        for (int i = 0; i < numbers; i++) {
//            int random = (int) (Math.random() * maxValue) + 1;
//            bag.add(random);
//        }
        return bag;
    }
}

public class TestLottery {
    public static void main(String[] args) {
//        LotteryGenerator lotteryGenerator = new LotteryGenerator();
//        System.out.println(lotteryGenerator.generateLotteryNumbers(100, 5));

        /*老師解法*/
        Set<Integer> bag = LotteryGenerator.generateLotteryNumbers(100, 5);

        //印出隨機產生的樂透號碼
        System.out.println("印出隨機號碼： ");
        // 因為Set裡面沒有用index
//        for(int i = 0; i< bag.size();i++){
//            System.out.println(bag[i]);
//        }

        for (Integer number : bag) {
            System.out.println(number);
        }
    }
}
