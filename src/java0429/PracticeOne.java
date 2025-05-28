package java0429;

import java.util.Scanner;

class Dates {
    String mon = "Mon.";
    String tue = "Tue.";
    String wed = "Wed.";
    String thu = "Thu.";
    String fri = "Fri.";
    String sat = "Sat.";
    String sun = "Sun.";

    void askDate() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean correct = false;
        while (!correct) {
            System.out.println("請輸入星期的代表數字 (1~7): ");
            input = sc.next();
            switch (input) {
                case "1":
                    System.out.println(mon);
                    correct = true;
                    break;
                case "2":
                    System.out.println(tue);
                    correct = true;
                    break;
                case "3":
                    System.out.println(wed);
                    correct = true;
                    break;
                case "4":
                    System.out.println(thu);
                    correct = true;
                    break;
                case "5":
                    System.out.println(fri);
                    correct = true;
                    break;
                case "6":
                    System.out.println(sat);
                    correct = true;
                    break;
                case "7":
                    System.out.println(sun);
                    correct = true;
                    break;
                default:
                    System.out.println("輸入錯誤！請重新輸入。");
            }
        }
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        Dates d = new Dates();
        d.askDate();
    }
}