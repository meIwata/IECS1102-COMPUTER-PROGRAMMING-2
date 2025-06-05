package java0605;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // Set 是一個介面（interface），它定義了一組不允許重複元素的集合操作方法： HashSet、LinkedHashSet、TreeSet
        Set<String> student = new HashSet<String>();

        student.add("Tom");
        student.add("Jack");
        student.add("Mary");
        student.add("Linda");
        student.add("Alice");
        student.add("Bob");
        System.out.println("容器大小: " + student.size());
        student.add("Bob");
        student.add("Bob");
        System.out.println("容器大小: " + student.size());


        for (String s : student) {
            System.out.println(s);
        }
        // 相同的東西只放一次，放進去的順序跟拿出來的順序不一樣，set 沒有序號的概念
    }
}
