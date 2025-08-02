package java0802;

import java.util.Scanner;

// 四年一閏，百年不閏，四百年再閏。

public class LeapYear {

    Scanner sc = new Scanner(System.in);

    public void checkLeapYear() {

        while (true) {
            System.out.println("請輸入年分:");
            String input = sc.nextLine();
            if (input == null || input.isEmpty() || input.equalsIgnoreCase("exit")) {
                System.out.println("程式結束");
                break;
            }

            try {
                int year = Integer.parseInt(input);

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "是閏年");
                } else {
                    System.out.println(year + "不是閏年");
                }
            } catch (Exception e) {
                System.out.println("請輸入有效的年分或輸入exit結束程式");
            }
        }
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear();
    }
}

