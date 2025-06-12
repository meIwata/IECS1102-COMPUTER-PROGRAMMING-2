package java0612;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMain1 {
    public static void main(String[] args) {
        // 請從scanner輸入5個整數，最後印出5個整數加總得值
        System.out.println("請輸入5個整數: ");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();


        // 陣列方法
        int[] numbers = {one, two, three, four, five};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("總和: " + total);

        System.out.println("-----------------------");

        // 使用Set方法
        Set<Integer> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        int cal = 0;
        for (Integer integer : set) {
            cal += integer;
        }
        System.out.println("總和: " + cal);
    }
}
