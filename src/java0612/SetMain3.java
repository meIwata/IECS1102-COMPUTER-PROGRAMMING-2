package java0612;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SetMain3 {
    public static void main(String[] args) {
        // HW: 請從scanner不斷地輸入整數，直到使用者輸入"exit"，最後印出所有輸入整數加總的值
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("請輸入整數，結束請輸入 exit：");
        try {
            while (true) {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    int num = Integer.parseInt(input);
                    numbers.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("輸入錯誤，請重新輸入整數！");
                }
            }
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("總和: " + sum);
        } finally {
            System.out.println("程式結束");
            sc.close();
        }
    }
}