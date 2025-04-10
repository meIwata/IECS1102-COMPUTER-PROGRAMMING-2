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

            int gradeCategory = -1; // 代表成績類別：-1 代表無效輸入，其他代表有效類別

            if (num >= 90 && num <= 100) {
                gradeCategory = 1; // A
            } else if (num >= 80 && num < 90) {
                gradeCategory = 2; // B
            } else if (num >= 70 && num < 80) {
                gradeCategory = 3; // C
            } else if (num >= 60 && num < 70) {
                gradeCategory = 4; // D
            } else if (num >= 0 && num < 60) {
                gradeCategory = 5; // F
            }

            // 使用 switch case 來判斷
            switch (gradeCategory) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 5:
                    System.out.println("F");
                    break;
                default:
                    System.out.print("輸入錯誤，");
            }
        } while (num < 0 || num > 100);
        sc.close();
    }
}
