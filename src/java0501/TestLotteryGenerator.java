package java0501;

public class TestLotteryGenerator {
    public static void main(String[] args) {
//        LotteryGenerator generator = new LotteryGenerator();
//        System.out.println(generator.generateNumber());

        // 呼叫generateNumber，產生6個數
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            int num = LotteryGenerator.generateNumber();
//            System.out.println(num);
            // 比較是否重複
            boolean isSame = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == num) {
                    isSame = true;
                    break;
                }
            }
            // 如果重複就要執行外圈，再重抽一次
            if (isSame) {
                i--;
                continue;
            }

            // 把數字放到陣列中
            numbers[i] = num;
        }

        // 印出
//        System.out.println(numbers); // 印出記憶體位置

        System.out.print("樂透開獎號碼: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }
}