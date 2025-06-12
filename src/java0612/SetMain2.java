package java0612;

import java.util.*;

public class SetMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入5個整數: ");
        List<Integer> numbers = new ArrayList<>();
        try {
            while (numbers.size() < 5) {
                try {
                    int num = sc.nextInt();
                    numbers.add(num);
                } catch (InputMismatchException e) {
                    /*提示輸入錯誤，重新讓使用者輸入*/
//                System.out.println("輸入錯誤，請重新輸入整數！");
//                sc.next(); // 消耗錯誤輸入

                    /*提示輸入錯誤，直接做加總*/
                    System.out.println("格式輸入錯誤");
                    break;
                }
            }
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("總和: " + sum);
        } finally { // 無論如何都會執行
            System.out.println("程式結束");
            sc.close(); // 可以在這裡關閉 Scanner
        }
    }
}