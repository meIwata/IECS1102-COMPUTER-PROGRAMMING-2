package java0506;

// 定義隨機數產生器
class LotteryGenerator {
    // 產生一個隨機整數介於 1~49 之間
    public static int generateNumber() {
        double random = Math.random(); // 0.0~0.9999
        random = random * 49;         // 0.0~48.9999
        int value = (int) random;     // 0~48
        value += 1;                   // 1~49
        return value;
    }

    // 產生一組有 6 個不重複的隨機整數介於 1~49 之間
    public static int[] generateNumbers() {
        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            int num = generateNumber();
            boolean isDuplicate = false;

            // 檢查是否有重複
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            // 如果不重複，加入陣列
            if (!isDuplicate) {
                numbers[count] = num;
                count++;
            }
        }

        return numbers;
    }
}

public class TestLottery {
    public static void main(String[] args) {
        int[] numbers = LotteryGenerator.generateNumbers();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}