package java0610;

import java.util.ArrayList;
import java.util.List;

// List（動態陣列）與傳統陣列的差異，以及 ArrayList 的基本用法
public class ListDemo {
    public static void main(String[] args) {
//        int[] intNumbers = new int[3];
//        for (int i = 0; i < intNumbers.length; i++) {
//            intNumbers[i] = i;
//        }
//        intNumbers[3] = 5; // 超出陣列範圍，報錯 ArrayIndexOutOfBoundsException

        List<Integer> listNumbers = new ArrayList<>(); // 長度可動態增減
        for (int i = 0; i < 3; i++) {
            listNumbers.add(i);
        }
        // listNumbers.add(1, 5); // 增加，可以指定插入的位置
        listNumbers.set(1, 5); // 修改指定位置的參數
        listNumbers.add(10);

        for (Integer number : listNumbers) {
            System.out.println(number);
        }
    }
}
