package java0603;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("請輸入您的姓名");

        // 讀入使用者輸入字串
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // maRy lin


        String lowerCaseName = name.toLowerCase(); // 字母轉小寫
        System.out.println(lowerCaseName);

        // 根據規則編碼
        String encodeString = lowerCaseName.replace("A", "4")
                .replace("a", "4")
                .replace("E", "3")
                .replace("e", "3")
                .replace("I", "1")
                .replace("i", "1")
                .replace("O", "0")
                .replace("o", "0")
                .replace("S", "5")
                .replace("s", "5")
                .replace("T", "7")
                .replace("t", "7");

        System.out.println(encodeString);

        // 使用trim/split方法
        String[] words = encodeString.trim().split(" ");

        // 字串串接 使用StringBuilder
        StringBuilder sb = new StringBuilder("");
        for (String word : words) {
            System.out.println("切割後: " + word);
            if (word.isBlank()) {
                System.out.println("是空白");
            } else {
                // mary
                // 1. m => M
//                System.out.println("第一個字元: " + word.charAt(0));
                System.out.println("第一個字元: " + word.substring(0, 1));
//                String firstChar = String.valueOf(word.charAt(0)).toUpperCase();
                String firstChar = word.substring(0, 1).toUpperCase();
                System.out.println("第一個字元: " + firstChar);

                // 2. "M" + "4ry"
                String subChars = word.substring(1).toLowerCase(); // 從序號１到最後
                System.out.println("子字串: " + subChars);
                sb.append(firstChar).append(subChars).append(" ");
            }
        }
        System.out.println("HI " + sb.toString().trim()); // 使用.trim()把最後的空白去除
    }
}
