package java0612;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student2 {
    private String sId;
    private String name;
    private int age;

    public Student2(String sId) {
        this.sId = sId;
    }

    public Student2(String sId, String name, int age) {
        this.sId = sId;
        this.name = name;
        this.age = age;
    }

    public String getsId() {
        return sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TestStudent2 {
    public static void main(String[] args) {
        // 使用鍵值對方式
        Student2 tom = new Student2("S001", "Tom", 18);
        Student2 mary = new Student2("S002", "Mary", 20);
        Student2 john = new Student2("S003", "John", 21);

        Map<String, Student2> oopClass = new HashMap<>();
        oopClass.put("S001", tom);
        oopClass.put("S002", mary);
        oopClass.put("S003", john);

        Student2 student2 = oopClass.get("S002");
        System.out.println("學生的姓名: " + student2.getName());
    }
}
