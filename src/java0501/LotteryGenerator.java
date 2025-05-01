package java0501;

public class LotteryGenerator {
    // 產生一個隨機整數 介於1~49之間
    static int generateNumber() {
        double random = Math.random(); // Math.random() 產生 0.0 ~ 1.0 (不包含 1.0)，乘以 49 變為 0.0 ~ 48.999...
        random = random * 49;
        int value = (int) random + 1;      // 強制轉型為整數後加 1，範圍變為 1 ~ 49
        return value;                // 回傳隨機數值
    }

    // 產生一個6個隨機整數介於介於1~49之間
    // 6個數不能重複
    static int[] generateNumbers() {
        int[] numbers = new int[6];

        // 處理重複的號碼
        for (int i = 0; i < numbers.length; i++) {
            int number = generateNumber();
            if (i > 0) {
                int usedIndex = 0;
                boolean isUsed = false;
                for (int j = 0; j == usedIndex; j++) {
                    if (number == numbers[j]) {
                        isUsed = true;
                        break;
                    }
                }
                if (!isUsed) {
                    usedIndex++;
                    numbers[i] = number;
                }
            } else { // i ==0;
                numbers[0] = number;
            }
        }
        return numbers;
    }
}
