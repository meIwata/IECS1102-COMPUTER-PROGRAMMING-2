package java0610;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparisonDemo {
    public static void main(String[] args) {
        // 建立 ArrayList 和 LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 加入元素
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);      // 在尾端加入
            linkedList.add(i);
        }

        // 插入元素到第2個位置
        arrayList.add(1, 99);     // 在索引1的位置插入99
        linkedList.add(1, 99);

        // 移除第3個元素
        arrayList.remove(2);      // 移除索引2的元素
        linkedList.remove(2);

        // 取得第4個元素
        int arrVal = arrayList.get(3);
        int lnkVal = linkedList.get(3);

        // 印出最終內容
        System.out.println("ArrayList:  " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList 第4個元素: " + arrVal);
        System.out.println("LinkedList 第4個元素: " + lnkVal);
    }
}
