package java_0410;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("請輸入成績: ");
            // 如果不是整數就提示並跳過
            while (!sc.hasNextInt()) {
                System.out.print("輸入錯誤，請重新輸入: ");
                sc.next();
            }

            num = sc.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("A");
            } else if (num >= 80 && num < 90) {
                System.out.println("B");

            } else if (num >= 70 && num < 80) {
                System.out.println("C");

            } else if (num >= 60 && num < 70) {
                System.out.println("D");

            } else if (num >= 0 && num < 60) {
                System.out.println("F");

            } else {
                System.out.print("輸入錯誤，");
            }
        } while (num < 0 || num > 100);
        sc.close();
    }
}
