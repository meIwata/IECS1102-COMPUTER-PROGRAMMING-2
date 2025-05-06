package java0506;

import java.util.Scanner;

public class TestString02 {
    public static void main(String[] args) {
        String str1 = "Hello" + 1 + 2 + 3;

//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());

        // 終極密碼
        // 隨機產生1~100的整數，讓使用者猜
        // 當使用者輸數猜的整數後，若沒有猜中，必須要告訴使用者密碼介於那兩數之間

        int answer = (int) (Math.random() * 100) + 1; // 生成 1 到 100 的隨機整數
        Scanner sc = new Scanner(System.in);
        System.out.println("答案: " + answer);
        System.out.println("請輸入1 到 100 之間一個整數: ");
        int min = 0;
        int max = 100;
        while (true) {
            int guess = sc.nextInt();
            if (guess != answer) {
                if (guess > answer) {
                    // 更新最大值，並提示範圍
                    max = guess - 1;
                    System.out.println("介於 " + min + " ~ " + max + " 之間");
                } else if (guess < answer) {
                    // 更新最小值，並提示範圍
                    min = guess + 1;
                    System.out.println("介於 " + min + " ~ " + max + " 之間");
                }
                continue;
            } else {
                System.out.println("答對了！");
                break;
            }
        }
    }
}
