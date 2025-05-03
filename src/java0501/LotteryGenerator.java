package java0501;

import java.util.Arrays;

public class LotteryGenerator {
    // 產生一個隨機整數 介於1~49之間
    static int generateNumber() {
        double random = Math.random(); // Math.random() 產生 0.0 ~ 1.0 (不包含 1.0)，乘以 49 變為 0.0 ~ 48.999...
        random = random * 49;
        int value = (int) random + 1; // 強制轉型為整數後加 1，範圍變為 1 ~ 49
        return value; // 回傳隨機數值
    }
}
