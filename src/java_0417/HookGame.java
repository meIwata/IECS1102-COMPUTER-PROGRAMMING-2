package java_0417;

import java.util.Random;
import java.util.Scanner;

public class HookGame {
    public static void main(String[] args) {
        int count = 0, input = 0;
        boolean success = true;
        boolean[] bucket = new boolean[10];
        boolean[] knifes = new boolean[bucket.length];

        bucket[new Random().nextInt(bucket.length)] = true;
        Scanner scanner = new Scanner(System.in);

        while (success && count < 5) {// 未死亡且未滿五刀, 流程控制
            // 秀出沒有刀的洞
            for (int i = 0; i < knifes.length - 1; i++) //流程控制
                if (!knifes[i]) System.out.print(i + ", "); //判斷, 利用System 物件輸出
            if (!knifes[knifes.length - 1]) //因最後一個洞後就不印”,”了
                System.out.println(knifes.length - 1);

            input = scanner.nextInt();// 取得user的下一刀的位置(一個整數), 輸入

            if (input < 0 || input > bucket.length || knifes[input]) // 刀插到外面或已有刀
                continue;// 重插
            knifes[input] = true; // 插入刀子
            success = !bucket[input];// true死亡, false安全
            count++;
        }
        System.out.println(success ? "過關" : "失敗");
    }
}
