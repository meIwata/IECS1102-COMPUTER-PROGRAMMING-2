package java0610;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceCompare {
    public static void main(String[] args) {
        final int ELEMENTS = 100_000;

        // 建立 ArrayList 和 LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 加入元素到 ArrayList
        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 加入 " + ELEMENTS + " 筆資料花費時間: " + (end - start) + " ms");

        // 加入元素到 LinkedList
        start = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 加入 " + ELEMENTS + " 筆資料花費時間: " + (end - start) + " ms");

        // 隨機存取 ArrayList
        start = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            int val = arrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 隨機存取 " + ELEMENTS + " 筆資料花費時間: " + (end - start) + " ms");

        // 隨機存取 LinkedList
        start = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            int val = linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 隨機存取 " + ELEMENTS + " 筆資料花費時間: " + (end - start) + " ms");

        // 在開頭插入 1000 筆資料
        int insertions = 1000;

        start = System.currentTimeMillis();
        for (int i = 0; i < insertions; i++) {
            arrayList.add(0, -i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 在開頭插入 " + insertions + " 筆資料花費時間: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < insertions; i++) {
            linkedList.add(0, -i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 在開頭插入 " + insertions + " 筆資料花費時間: " + (end - start) + " ms");
    }
}