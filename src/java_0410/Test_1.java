package java_0410;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("請輸入成績: ");
            int num = sc.nextInt();

            if (num >= 90 && num <= 100) {
                System.out.println("A");
                break;
            } else if (num >= 80 && num < 90) {
                System.out.println("B");
                break;
            } else if (num >= 70 && num < 80) {
                System.out.println("C");
                break;
            } else if (num >= 60 && num < 70) {
                System.out.println("D");
                break;
            } else if (num >= 0 && num <60) {
                System.out.println("F");
                break;
            } else{
                System.out.println("輸入錯誤，請重新輸入!");
            }
        }
        sc.close();
    }
}
