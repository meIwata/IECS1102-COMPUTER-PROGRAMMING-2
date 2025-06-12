package java0612;

import java.util.*;

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
        Student2 tom = new Student2("S011", "Tom", 18);
        Student2 mary = new Student2("S008", "Mary", 20);
        Student2 john = new Student2("S003", "John", 21);

//        Map<String, Student2> oopClass = new HashMap<>(); // 放進去跟拿出來的順序不一樣
//        Map<String, Student2> oopClass = new LinkedHashMap<>(); // 放進去跟拿出來的順序一樣
        Map<String, Student2> oopClass = new TreeMap<>(); // 放進去跟拿出來的順序會幫你排序好
        oopClass.put("S011", tom);
        oopClass.put("S008", mary);
        oopClass.put("S003", john);

        System.out.println("現在裡面有: " + oopClass.size() + " 組資料");

        Set<String> ids = oopClass.keySet();
        for (String studentId : ids) {
            Student2 student = oopClass.get(studentId);
            System.out.println(student.getsId() + ", " + student.getName() + ", " + student.getAge());
        }


//        Student2 student2 = oopClass.get("S002");
//        System.out.println("學生的姓名: " + student2.getName());

    }
}
