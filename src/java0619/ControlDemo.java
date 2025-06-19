package java0619;

import java.util.Scanner;

// https://fluffy-jujube-1b8.notion.site/Control-Flow-and-Decision-Making-5585949639da42c0ac40f1c09c852040
public class ControlDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你的大學年級: ");
        int year = sc.nextInt();

        // if...else判斷
//        if (year == 1) {
//            System.out.println("大一生菜鳥");
//        } else if (year == 2) {
//            System.out.println("大二學長姐");
//        } else if (year == 3) {
//            System.out.println("大三生做專題");
//        } else if (year == 4) {
//            System.out.println("大四生準備畢業");
//        } else {
//            System.out.println("延畢");
//        }


        // switch判斷
        switch (year) {
            case 1:
                System.out.println("大一生菜鳥");
                break;
            case 2:
                System.out.println("大二學長姐");
                break;
            case 3:
                System.out.println("大三生做專題");
                break;
            case 4:
                System.out.println("大四生準備畢業");
                break;
            default:
                System.out.println("延畢");
        }
    }
}
