package java0501;

public class TestLotteryGenerator {
    public static void main(String[] args) {
        int[] numbers = LotteryGenerator.generateNumbers();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}